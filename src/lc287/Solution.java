package lc287;

import java.util.Arrays;

public class Solution {
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int nums[] = {7,9,7,4,2,8,7,7,1,5};
        int res = findDuplicate(nums);
        System.out.println(res);
    }
}
