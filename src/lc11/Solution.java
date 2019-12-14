package lc11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int maxArea(int[] height){
        int l = height.length;
        List<Integer> temp = new ArrayList<>();
        int i=0;
        int j=l-1;
        while (i!=j){
            if(height[i]>=height[j]){
                temp.add(height[j]*(j-i));
                j--;
            }else {
                temp.add(height[i]*(j-i));
                i++;
            }
        }
        int res = Collections.max(temp);
        return res;
    }
    public static void main(String[] args){
        int[] hegiht = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(hegiht));
    }
}
