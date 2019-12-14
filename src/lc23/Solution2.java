package lc23;

public class Solution2 {
    public ListNode mergeKList(ListNode[] lists){
        int l = 0;
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            while (head!=null){
                head = head.next;
                l=l+1;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode phead = dummy;
        while (l>0){
            int index = -1;
            int m = 9999999;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null&&lists[i].val<m){
                    m = lists[i].val;
                    index = i;
                }
            }
            lists[index] = lists[index].next;
            phead.next = new ListNode(m);
            phead = phead.next;
            l--;
        }
        return dummy.next;
    }
}
