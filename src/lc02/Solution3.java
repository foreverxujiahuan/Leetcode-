package lc02;

public class Solution3 {
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int carry = 0;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        while (l1!=null||l2!=null){
            if(l1!=null){
                carry = carry+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                carry = carry+l2.val;
                l2=l2.next;
            }
            ListNode node = new ListNode(carry%10);
            phead.next = node;
            phead = phead.next;
            carry = carry/10;
        }
        if(carry==1){
            phead.next = new ListNode(1);
        }
        return dummy.next;
    }
}
