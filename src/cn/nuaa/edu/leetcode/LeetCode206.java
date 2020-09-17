package nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/9/17 10:51
 * 备注：leetcode206 反转链表
 */
public class LeetCode206 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
