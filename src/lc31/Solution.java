package lc31;

import java.util.Arrays;

public class Solution {
    public static void nextPermutation(int[] nums){
        if(nums.length==0){
            return;
        }
        int replace = nums.length-2;
        while (replace>=0){
            if(nums[replace]<nums[replace+1]){
                break;
            }
            replace--;
        }
        if(replace<0){
            Arrays.sort(nums);
            return;
        }
        int lgrIdx = replace+1;
        while (lgrIdx<nums.length&&nums[lgrIdx]>nums[replace]){
            lgrIdx++;
        }
        int tmp = nums[replace];
        nums[replace] = nums[lgrIdx-1];
        nums[lgrIdx-1] = tmp;
        Arrays.sort(nums,replace+1,nums.length);
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,6,2};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
