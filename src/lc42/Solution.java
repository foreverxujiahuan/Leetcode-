package lc42;

public class Solution {
    public static int trap(int[] height){
        int l=0;
        int r = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int res = 0;
        while (l<r){
            lmax = Math.max(height[l],lmax);
            rmax = Math.max(height[r],rmax);
            if(lmax<rmax){
                res = res+(lmax-height[l]);
                l=l+1;
            }else {
                res = res+(rmax-height[r]);
                r=r-1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(height);
        System.out.println(res);
    }
}
