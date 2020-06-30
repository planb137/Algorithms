package cn.nuaa.edu.practice;

import java.util.Stack;

/**
 * @author planb
 * @date 2020/6/30 15:52
 * 备注：
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else {
            if(stack1.isEmpty()){
                return -1;
            }
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }


}
