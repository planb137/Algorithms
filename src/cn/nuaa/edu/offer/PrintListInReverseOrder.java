package cn.nuaa.edu.offer;

import java.util.Stack;

/**
 * @author planb
 * @date 2020/6/18 13:48
 * 备注：
 */
class ListNode{
    int key;
    ListNode next;

    public ListNode(int key) {
        this.key=key;
        this.next=null;
    }
}
public class PrintListInReverseOrder {

    // 采用栈
    public void printListReversingly_Iteratively(ListNode node) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (node!= null) {
            stack.push(node);
            node=node.next;
        }
        while(!stack.empty()) {
            System.out.println(stack.pop().key);
        }
    }

    //采用递归
    public void printListReversingly_Recursively(ListNode node) {
        if(node!=null) {
            printListReversingly_Recursively(node.next);
            System.out.println(node.key);
        }else {
            return;
        }
    }


    // ==================================测试代码==================================
    /**
     * 链表为空
     */
    public void test1() {
        ListNode aListNode = null;
        System.out.println("采用栈：");
        printListReversingly_Iteratively(aListNode);
        System.out.println("采用递归：");
        printListReversingly_Recursively(aListNode);
    }

    /**
     * 多个结点链表
     */
    public void test2() {
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;
        System.out.println("采用栈：");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("采用递归：");
        printListReversingly_Recursively(ListNode1);
    }

    /**
     * 单个结点链表
     */
    public void test3() {
        ListNode ListNode1 = new ListNode(1);
        System.out.println("采用栈：");
        printListReversingly_Iteratively(ListNode1);
        System.out.println("采用递归：");
        printListReversingly_Recursively(ListNode1);
    }

    public static void main(String[] args) {
        PrintListInReverseOrder demo = new PrintListInReverseOrder();
        System.out.println("test1:");
        demo.test1();
        System.out.println("test2:");
        demo.test2();
        System.out.println("test3:");
        demo.test3();
    }
}