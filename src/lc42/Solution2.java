package lc42;

public class Solution2 {
    public static void main(String[] args){
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(nums);
        System.out.println(res);
    }
    public static int trap(int[] height){
        int lmax = 0;
        int rmax = 0;
        int res = 0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);
            if(lmax<rmax){
                res = res+lmax-height[left];
                left++;
            }else {
                res = res+rmax-height[right];
                right--;
            }
        }
        return res;
    }
}
