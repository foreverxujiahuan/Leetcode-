package lc39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,tmp,0,0,candidates,target);
        return res;
    }
    private static void dfs(List<List<Integer>> res,List<Integer> tmp,int curIdx,int sum,int[] candidates,int target){
        if(target<sum){
            return;
        }
        if(target==sum){
            res.add(new ArrayList<>(tmp));
        }
        for(int i=curIdx;i<candidates.length;i++){
            if(target<candidates[i]){
                return;
            }
            sum = sum+candidates[i];
            if(target<sum){
                return;
            }
            tmp.add(candidates[i]);
            dfs(res,tmp,i,sum,candidates,target);
            tmp.remove(tmp.size()-1);
            sum=sum-candidates[i];
        }
    }
    public static void main(String[] args){
        int[] candidates = {2,3,6,7};
        List<List<Integer>> res = combinationSum(candidates,7);
        System.out.println(res);
    }
}
