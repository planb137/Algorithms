package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/30 16:21
 * 备注：
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class SplitListToParts {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode curr = root;
        int x = 0;
        while (curr!=null){
            x++;
            curr = curr.next;
        }
        ListNode[] rs = new ListNode[k];

        int  width = x / k;
        int  rem = x % k;

        ListNode temp = root;

            for (int i=0 ; i<k ; i++){
                ListNode head = new ListNode(0), write = head;
                for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                    write = write.next = new ListNode(temp.val);
                    if (temp != null) {
                        temp = temp.next;
                    }
                }
                rs[i] = head.next;

            }

        return rs;
    }
}
