package lc496;

public class Solution {
    public static int[] nextGreaerElement(int[] nums1,int[] nums2){
        int l = nums1.length;
        int res[] = new int[l];
        for(int i=0;i<l;i++){
            int n = nums1[i];
            int flag = 1;
            int k=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==n){
                    k=j;
                    break;
                }
            }
            for(;k<nums2.length;k++){
                if(nums2[k]>n){
                    flag = 0;
                    res[i] = nums2[k];
                    break;
                }
            }
            if(flag==1) res[i] = -1;
        }
        return res;
    }
    public static void main(String[] args){
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        int[] res = nextGreaerElement(nums1,nums2);
        for(int i=0;i<res.length;i++) System.out.print(res[i]);
    }
}
