package lc21;

public class Solution2 {
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        while (l1!=null||l2!=null){
            if(l1==null){
                phead.next = new ListNode(l2.val);
                phead = phead.next;
                l2 = l2.next;
            }else if(l2==null){
                phead.next = new ListNode(l1.val);
                phead = phead.next;
                l1 = l1.next;
            }else {
                if(l1.val>=l2.val){
                    phead.next = new ListNode(l2.val);
                    phead = phead.next;
                    l2 = l2.next;
                }else {
                    phead.next = new ListNode(l1.val);
                    phead = phead.next;
                    l1 = l1.next;
                }
            }
        }
        return dummy.next;
    }
}
