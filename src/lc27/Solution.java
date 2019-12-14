package lc27;

public class Solution {
    public static int removeElement(int[] nums,int val){
        int l = nums.length;
        int i=0;
        for(int j=0;j<l;j++){
            if(nums[j]==val){
                for(int k=j;k<l-1;k++){
                    nums[k] = nums[k+1];
                }
                nums[l-1-i]=val+999;
                i=i+1;
                j=j-1;
            }
        }
        return l-i;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}
