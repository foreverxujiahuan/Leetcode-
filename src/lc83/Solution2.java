package lc83;

public class Solution2 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        while (head!=null){
            while (head.next!=null&&head.val==head.next.val){
                head = head.next;
            }
            phead.next = new ListNode(head.val);
            head = head.next;
            phead = phead.next;
        }
        return dummy.next;
    }
}
