package lc45;

public class Solution {
    public static int jump(int[] nums){
        int index = 0;
        int next_index = 0;
        int count = 0;
        int l = nums.length;
        for(int i=0;i<l-1;i++){
            next_index = Math.max(next_index,nums[i]+i);
            if(index==i){
                index = next_index;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int nums[] = {2,3,1,1,4};
        int count = jump(nums);
        System.out.println(count);
    }
}
