package lc25;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode reverseKGroup(ListNode head,int k){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        ListNode phead2 = head;
        ListNode phead3 = head;
        int l=0;
        while (phead2!=null){
            phead2 = phead2.next;
            l=l+1;
        }
        while (l>=k){
            List<ListNode> temp = new ArrayList<>();
            for(int i=0;i<k;i++){
                ListNode node = new ListNode(phead3.val);
                temp.add(node);
                phead3 = phead3.next;
            }
            for(int i=k-1;i>=0;i--){
                ListNode node = temp.get(i);
                phead.next = node;
                phead = phead.next;
            }
            l=l-k;
        }
        if(l!=0){
            phead.next = phead3;
        }
        return dummy.next;
    }
}
