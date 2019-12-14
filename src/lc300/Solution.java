package lc300;

public class Solution {
    public static int lengthOfLIS(int[] nums){
        int res = 0;
        int n = nums.length;
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int nums[]  = {10,9,2,5,3,4};
        int nums2[] = {};
        System.out.println(lengthOfLIS(nums));
    }
}
