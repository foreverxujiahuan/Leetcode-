package lc581;

public class Solution {
    public static int findUnsortedSubarray(int[] nums){
        int l = nums.length;
        if(l==1){
            return 0;
        }
        int flag = 0;
        for(int i=0;i<l-1;i++){
            if(nums[i]<nums[i+1]){
                flag = 1;
            }
        }
        if(flag==0){
            return l;
        }
        int left = 0;
        for(int i=0;i<l-1;i++){
            if(nums[i]>=nums[i+1]){
                left = i;
                break;
            }
        }
        int right = l-1;
        for(int i=right;i>=1;i--){
            if(nums[i]<nums[i-1]){
                right = i;
                break;
            }
        }
        int res = 0;
        if(right-left+1!=l){
            res = right-left+1;
        }
        return res;
    }
    public static void main(String[] args){
        int nums[] = {1,3,2,3,3};
        int res = findUnsortedSubarray(nums);
        System.out.println(res);
    }
}
