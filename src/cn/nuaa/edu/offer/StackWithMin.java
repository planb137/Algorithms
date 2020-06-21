package cn.nuaa.edu.offer;

import java.util.Stack;

/**
 * @author planb
 * @date 2020/6/21 12:15
 * 备注：
 */
//题目：定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min
//函数。在该栈中，调用min、push及pop的时间复杂度都是O(1)。

public class StackWithMin {

    Stack<Integer> stack_data=new Stack<Integer>();
    Stack<Integer> stack_min=new Stack<Integer>();

    public void push(int node) {
        stack_data.push(node);
        if(stack_min.empty() || stack_min.peek()>node) {
            stack_min.push(node);
        }else {
            stack_min.push(stack_min.peek());
        }
    }

    public void pop() {
        if(!stack_data.empty()) {
            stack_data.pop();
            stack_min.pop();
        }
    }

    public int min() {
        return stack_min.peek();
    }

    public static void main(String[] args) {

    }
}