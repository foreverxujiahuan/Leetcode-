package lc25;

public class Solution2 {
    public ListNode reverseKGroup(ListNode head,int k){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        int l = length(head);
        while (l>=k){
            ListNode[] temp = new ListNode[k];
            for(int i=0;i<k;i++){
                temp[i] = new ListNode(head.val);
                head = head.next;
            }
            for(int i=k-1;i>=0;i--){
                phead.next = temp[i];
                phead = phead.next;
            }
            l = l-k;
        }
        if (l!=0){
            phead.next = head;
        }
        return dummy.next;
    }
    private static int length(ListNode head){
        int l = 0;
        while (head!=null){
            head = head.next;
            l++;
        }
        return l;
    }
}
