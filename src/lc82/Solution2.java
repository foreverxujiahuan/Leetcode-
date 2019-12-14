package lc82;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        List<Integer> list = f(head);
        while (head!=null){
            if(!list.contains(head.val)){
                phead.next = new ListNode(head.val);
                phead = phead.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
    private static List<Integer> f(ListNode head){
        List<Integer> list = new ArrayList<>();
        if(head==null){
            return list;
        }
        while (head.next!=null){
            if(head.val==head.next.val){
                list.add(head.val);
            }
            head = head.next;
        }
        return list;
    }
}
