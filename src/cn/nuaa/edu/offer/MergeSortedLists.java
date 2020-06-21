package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/21 09:14
 * 备注：
 */
//题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按
//照递增排序的。

public class MergeSortedLists {
    public class ListNode{
        int val;
        ListNode next=null;
        public ListNode(int val) {
            this.val=val;
        }
    }

    /*
     * 递归版本
     */
    public ListNode merge(ListNode list1,ListNode list2) {
        if(list1==null) {
            return list2;
        }
        if(list2==null) {
            return list1;
        }
        if(list1.val<list2.val) {
            list1.next=merge(list1.next, list2);
            return list1;
        }else {
            list2.next=merge(list1, list2.next);
            return list2;
        }
    }

    /*
     * 非递归
     */
    public ListNode merge2(ListNode list1,ListNode list2) {
        if(list1==null) {
            return list2;
        }
        if(list2==null) {
            return list1;
        }
        ListNode dummyHead=new ListNode(0);  //不能为null
        ListNode p=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
            }else{
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
        }
        if(list1==null){
            p.next=list2;
        }

        else{
            p.next=list1;
        }

        return dummyHead.next;
    }
}