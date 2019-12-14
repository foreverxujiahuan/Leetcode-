package lc53;

public class Solution {
    public static int maxSubArray(int[] nums){
        int l = 0;
        int g = Integer.MIN_VALUE;
        for(int num:nums){
            l = Math.max(num,l+num);
            g = Math.max(l,g);
        }
        return g;
    }
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }
}
