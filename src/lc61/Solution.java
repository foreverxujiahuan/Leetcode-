package lc61;

public class Solution {
    public ListNode ratateRight(ListNode head,int k){
        if(head==null){
            return null;
        }
        ListNode phead = head;
        int l =0;
        while (phead!=null){
            phead=phead.next;
            l=l+1;
        }
        for(int i=0;i<k%l;i++){
            head = ratate(head);
        }
        return head;
    }
    private static ListNode ratate(ListNode head){
        ListNode phead = head;
        ListNode node = new ListNode(0);
        while (phead!=null){
            if(phead.next==null){
                node = new ListNode(phead.val);
            }
            phead = phead.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode phead2 = dummy;
        while (head!=null){
            if(head.next!=null){
                ListNode t = new ListNode(head.val);
                phead2.next = t;
            }
            phead2 = phead2.next;
            head=head.next;
        }
        node.next = dummy.next;
        return node;
    }
}
