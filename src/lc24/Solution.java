package lc24;

import java.util.Stack;

public class Solution {
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        ListNode phead2 = head;
        ListNode phead3 = head;
        int l =0;
        while (phead2!=null){
            phead2 = phead2.next;
            l=l+1;
        }
        while (l>=2){
            ListNode node1 = new ListNode(phead3.val);
            ListNode node2 = new ListNode(phead3.next.val);
            phead3 = phead3.next.next;
            phead.next = node2;
            phead = phead.next;
            phead.next = node1;
            phead = phead.next;
            l=l-2;
        }
        if(l==1){
            phead.next = phead3;
        }
        return dummy.next;
    }
}
