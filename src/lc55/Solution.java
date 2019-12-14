package lc55;

public class Solution {
    public static boolean canJump(int[] nums){
        int index = 0;
        int reach = 0;
        int l = nums.length;
        if(l<1) return true;
        while (index<l){
            if(reach<index) return false;
            reach = Math.max(reach,nums[index]+index);
            index++;
        }
        return true;
    }
    public static void main(String[] args){

    }
}
