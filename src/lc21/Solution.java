package lc21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                ListNode node = new ListNode(l1.val);
                head.next = node;
                head = head.next;
                l1=l1.next;
            }else {
                ListNode node = new ListNode(l2.val);
                head.next = node;
                head = head.next;
                l2=l2.next;
            }
        }
        if(l1==null){
            head.next = l2;
        }
        if(l2==null){
            head.next = l1;
        }
        return dummy.next;
    }
}