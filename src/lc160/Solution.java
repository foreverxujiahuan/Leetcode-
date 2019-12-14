package lc160;

public class Solution {
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        int lengA = length(headA);
        int lengB = length(headB);
        for(int i=0;i<lengA;i++){
            if(lengA-i>lengB){
                continue;
            }else {
                ListNode pheadA = headA;
                ListNode pheadB = headB;
                int j = lengB-lengA+i;
                int ii=i;
                while (ii>0){
                    pheadA = pheadA.next;
                    ii--;
                }
                while (j>0){
                    pheadB = pheadB.next;
                    j--;
                }
                if(f(pheadB,pheadA)){
                    return pheadA;
                }
            }
        }
        return null;
    }
    private static int length(ListNode head){
        ListNode phead = head;
        int l = 0;
        while (phead!=null){
            phead = phead.next;
            l=l+1;
        }
        return l;
    }
    private static boolean f(ListNode l1,ListNode l2){
        ListNode p1 = l1;
        ListNode p2 = l2;
        if(length(p1)!=length(p2)){
            return false;
        }
        while (p1!=null&&p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
