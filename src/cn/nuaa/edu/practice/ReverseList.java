package cn.nuaa.edu.practice;

import java.util.Stack;

/**
 * @author planb
 * @date 2020/6/18 14:02
 * 备注：
 */
class ListNode{
    int key;
    ListNode next;

    ListNode(int key){
        this.key = key;
        this.next = null;
    }
}
public class ReverseList {

    private static void reverseListByStack(ListNode node){
        Stack<ListNode> stack = new Stack<ListNode>();
        while (null != node ){
            stack.push(node);
            node = node.next;
        }
        while (!stack.empty()){
            System.out.println(stack.pop().key);
        }

    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        reverseListByStack(node1);

    }

}
