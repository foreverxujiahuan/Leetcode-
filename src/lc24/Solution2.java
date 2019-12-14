package lc24;

public class Solution2 {
    public ListNode swapPairs(ListNode head){
        int l = length(head);
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        while (l>=2){
            ListNode node1 = new ListNode(head.val);
            head = head.next;
            ListNode node2 = new ListNode(head.val);
            head = head.next;
            phead.next = node2;
            phead = phead.next;
            phead.next = node1;
            phead = phead.next;
            l=l-2;
        }
        if(l==1){
            phead.next = head;
        }
        return dummy.next;
    }
    private static int length(ListNode head){
        int l = 0;
        while (head!=null){
            head = head.next;
            l=l+1;
        }
        return l;
    }
}
