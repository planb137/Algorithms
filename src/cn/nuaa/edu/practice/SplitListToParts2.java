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

public class SplitListToParts2 {
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

        int width = x / k;
        int  rem = x % k;

        curr = root;
            for (int i=0;i<k;++i){
                ListNode head  = curr;
                for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
                    if (curr!=null){
                        curr = curr.next;
                    }
                }
                if(curr!=null){
                    ListNode node = curr;
                    curr = curr.next;
                    node.next = null;
                }
                rs[i] = head;

            }

        return rs;
    }
}
