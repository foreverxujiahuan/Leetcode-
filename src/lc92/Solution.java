package lc92;

import java.util.Stack;

public class Solution {
    public static ListNode reverseBetween(ListNode head,int m,int n){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        int index = 1;
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            while (index>=m&&index<=n){
                ListNode node = new ListNode(head.val);
                stack.push(node);
                index++;
                head = head.next;
            }
            if(stack.isEmpty()){
                phead.next = new ListNode(head.val);
                phead = phead.next;
                head = head.next;
                index++;
            }
            while (!stack.isEmpty()){
                phead.next = stack.pop();
                phead = phead.next;
            }
        }
        return dummy.next;
    }
}
