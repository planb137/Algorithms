package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/19 13:40
 * 备注：两个栈实现队列
 */
import java.util.Stack;

// 题目：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail
// 和deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。

public class QueueWithTwoStacks {

    class Queue{
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        /**
         * 插入结点
         */
        public void push(int node) {
            stack1.push(node);
        }

        /**
         * 删除结点
         */
        public int pop() {
            if (stack2.empty()) {
                if (stack1.empty())
                {throw new RuntimeException("队列为空！");}
                else {
                     while (!stack1.empty()){
                        stack2.push(stack1.pop());}
                }
            }
            return stack2.pop();
        }
    }


    //=======测试代码==========

    public void test1() {
        Queue queue= new Queue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

    /**
     * 往空队列删除元素
     */
    public void test2() {
        Queue queue= new Queue();
        System.out.println(queue.pop());
    }

    public static void main(String[] args) {
        QueueWithTwoStacks demo = new QueueWithTwoStacks();
        demo.test1();
        demo.test2();
    }

}