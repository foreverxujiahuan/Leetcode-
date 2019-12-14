package lc19;

public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int l = 0;
        while (first!=null){
            first = first.next;
            l=l+1;
        }
        l = l-n;
        first = dummy;
        while (l>0){
            first = first.next;
            l=l-1;
        }
        first.next = first.next.next;
        return dummy.next;
    }

}
