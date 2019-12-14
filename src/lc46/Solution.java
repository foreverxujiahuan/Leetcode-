package lc46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        perm(res,0,nums.length,nums);
        return res;
    }
    private static void perm(List<List<Integer>> res,int begin,int end,int[] nums){
        if(begin==end){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            res.add(temp);
        }else {
            int i=begin;
            for(int j=begin;j<end;j++){
                {int t = nums[j];nums[j]=nums[i];nums[i]=t;}
                perm(res,begin+1,end,nums);
                {int t = nums[j];nums[j]=nums[i];nums[i]=t;}
            }
        }
    }
    public static void main(String[] args){
        int[] nums ={1,2,3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }
}
