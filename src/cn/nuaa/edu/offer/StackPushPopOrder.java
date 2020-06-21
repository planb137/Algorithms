package cn.nuaa.edu.offer;

import java.util.Stack;

/**
 * @author planb
 * @date 2020/6/21 14:08
 * 备注：
 */
//题目：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是
//否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1、2、3、4、
//5是某栈的压栈序列，序列4、5、3、2、1是该压栈序列对应的一个弹出序列，但
//4、3、5、1、2就不可能是该压栈序列的弹出序列。

public class StackPushPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if(pushA==null || popA==null) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        //必须提前判断长度是否相等
        if(popA.length!=pushA.length || pushA.length==0) {
            return false;
        }
        int popIndex=0;
        for(int pushIndex=0; pushIndex<pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while(!stack.empty() &&stack.peek()==popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
