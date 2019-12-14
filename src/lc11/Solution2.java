package lc11;

public class Solution2 {
    public static void main(String[] args){
        int heights[] = {};
        int res = maxArea(heights);
        System.out.println(res);
    }
    public static int maxArea(int[] height){
        int l = height.length;
        if(l==0) return 0;
        int left = 0;
        int right = l-1;
        int res = 0;
        while (left!=right){
            int temp;
            if(height[left]<height[right]){
                temp = height[left]*(right-left);
                left++;
            }else {
                temp = height[right]*(right-left);
                right--;
            }
            if(temp>res){
                res = temp;
            }
        }
        return res;
    }
}
