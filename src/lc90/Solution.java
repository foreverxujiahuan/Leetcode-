package lc90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        int l = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        for(int i=0;i<l;i++){
            int t = nums[i];
            int leng = res.size();
            for(int j=0;j<leng;j++){
                List<Integer> tt = new ArrayList<>();
                Collections.addAll(res.get(j));
                tt.add(t);
                Collections.sort(tt);
                if(!res.contains(tt)){
                    res.add(tt);
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int nums[] = new int[]{1,2,2};
        List<List<Integer>> res = subsetsWithDup(nums);
        System.out.println(res);
    }
}
