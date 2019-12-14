package lc42;

public class Solution3 {
    public static int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        while (left<right){
            leftmax = Math.max(height[left],leftmax);
            rightmax = Math.max(height[right],rightmax);
            if(leftmax<rightmax){
                water=water+leftmax-height[left];
                left=left+1;
            }else {
                water = water+rightmax-height[right];
                right=right-1;
            }
        }
        return water;
    }
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = trap(height);
        System.out.println(water);
    }
}
