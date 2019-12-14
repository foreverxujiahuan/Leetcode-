package lc206;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            ListNode node = new ListNode(head.val);
            stack.push(node);
            head = head.next;
        }
        while (!stack.isEmpty()){
            ListNode node = stack.pop();
            phead.next = node;
            phead = phead.next;
        }
        return dummy.next;
    }
}
