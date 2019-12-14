package lc40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combinationSum2(int[] candidates,int target){
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(res,tmp,0,0,candidates,target);
        return res;
    }
    private static void dfs(List<List<Integer>> res,List<Integer> tmp,int curIdx,int sum,int[] candidates,int target){
        if(target<sum){
            return;
        }
        if(target==sum){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=curIdx;i<candidates.length;i++){
            if (i > curIdx && candidates[i] == candidates[i - 1])
                continue;
            if(candidates[i]>target){
                return;
            }
            sum=sum+candidates[i];
            if(sum>target){
                return;
            }
            tmp.add(candidates[i]);
            dfs(res,tmp,i+1,sum,candidates,target);
            tmp.remove(tmp.size()-1);
            sum=sum-candidates[i];
        }
    }
    public static void main(String[] args){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidates,target);
        System.out.println(res);
    }
}
