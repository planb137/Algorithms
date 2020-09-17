package nuaa.edu.nowcoder.huawei;

/**
 * @author planb
 * @date 2020/9/17 08:13
 * 备注：华为2面（反转链表）
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

public class Demo12 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.getNext().setNext(head);
        head.setNext(null);
        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        ListNode newNode = reverseList(node1);
        while (null != newNode) {
            System.out.println(newNode.val+" ");
            newNode = newNode.next;
        }
    }
}
