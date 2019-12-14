package lc02;

public class Solution4 {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        int carry = 0;
        while (l1!=null||l2!=null){
            if(l1==null){
                int t = l2.val+carry;
                carry = t/10;
                t = t%10;
                phead.next = new ListNode(t);
                l2 = l2.next;
                phead = phead.next;
            }
            else if(l2==null){
                int t = l1.val+carry;
                carry = t/10;
                t = t%10;
                phead.next = new ListNode(t);
                l1 = l1.next;
                phead = phead.next;

            }else {
                int t = l1.val+l2.val+carry;
                carry = t/10;
                t = t%10;
                phead.next = new ListNode(t);
                phead = phead.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if(carry==1){
            phead.next = new ListNode(1);
        }
        return dummy.next;

    }
}
