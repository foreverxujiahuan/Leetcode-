package lc16;

import java.util.Arrays;

public class Solution {
    public static int threeSumClosest(int[] nums,int target){
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int length = nums.length;
        if(length<3){
            return 0;
        }
        int left,right,comp,result=0;
        for (int i=0;i<length-2;i++){
             left=i+1;
             right = length-1;
             while (left<right){
                 comp = nums[i]+nums[left]+nums[right];
                 if(Math.abs(comp-target)<min){
                     min = Math.abs(comp-target);
                     result = comp;
                 }
                 if(comp>target){
                     right--;
                 }else if(comp<target){
                     left++;
                 }else {
                     return target;
                 }
             }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
}
