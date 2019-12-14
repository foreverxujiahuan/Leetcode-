package lc26;

public class Solution {
    public static int removeDuplicates(int[] nums){
        int l = nums.length;
        if(l==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<l;j++){
            if(nums[i]!=nums[j]){
                i=i+1;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] nums = {0,1};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
