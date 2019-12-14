package lc23;


public class Solution {
    public ListNode mergeKLists(ListNode[] lists){
        int n = lists.length;
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        int l =0;
        for(int i=0;i<n;i++){
            ListNode head = lists[i];
            while (head!=null){
                head=head.next;
                l=l+1;
            }
        }
        while (l>0){
            int m = 9999999;
            int index = -1;
            ListNode temp = new ListNode(0);
            for(int i=0;i<n;i++){
                if(lists[i]!=null&&lists[i].val<m){
                    m = lists[i].val;
                    temp = new ListNode(m);
                    index = i;
                }
            }
            lists[index] = lists[index].next;
            phead.next = temp;
            phead = phead.next;
            l=l-1;
        }
        return dummy.next;
    }
}
