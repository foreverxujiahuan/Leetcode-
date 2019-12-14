package lc142;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head){
        Set<ListNode> nodes = new HashSet<>();
        ListNode phead = head;
        while (phead!=null){
            if(nodes.contains(phead)){
                return phead;
            }else {
                nodes.add(phead);
            }
            phead = phead.next;
        }
        return null;
    }
}
