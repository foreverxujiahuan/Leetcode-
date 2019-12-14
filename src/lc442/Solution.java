package lc442;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(nums);
        System.out.println(res);
    }
    public static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer,Integer> hs = new HashMap<>();
        int l = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<l;i++){
            if(hs.containsKey(nums[i])){
                res.add(nums[i]);
            }else {
                hs.put(nums[i],1);
            }
        }
        return res;
    }
}
