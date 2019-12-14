package lc414;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int thirdMax(int[] nums){
        List<Integer> temp = new LinkedList<>();
        int l = nums.length;
        Arrays.sort(nums);
        for (int i = 0;i<l;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
            }
        }
        int ll = temp.size();
        if(ll==2){
            return temp.get(1);
        }
        if(ll==1){
            return temp.get(0);
        }
        return temp.get(ll-3);
    }
    public static void main(String[] args){
        int[] nums = {3,2,1,2};
        System.out.println(thirdMax(nums));
    }
}
