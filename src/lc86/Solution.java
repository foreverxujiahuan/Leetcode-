package lc86;

public class Solution {
    public static ListNode partition(ListNode head,int x){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        ListNode p1 = head;
        while (p1!=null){
            if(p1.val<x){
                phead.next = new ListNode(p1.val);
                phead = phead.next;
            }
            p1 = p1.next;
        }
        ListNode p2 = head;
        while (p2!=null){
            if(p2.val>=x){
                phead.next = new ListNode(p2.val);
                phead = phead.next;
            }
            p2 = p2.next;
        }
        return dummy.next;
    }
}
