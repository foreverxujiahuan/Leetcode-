package lc77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combine(int n,int k){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(res,k,cur,n,1);
        return res;
    }
    private static void dfs(List<List<Integer>> res,int k,List<Integer> cur,int n,int start){
        if(k==0){
            res.add(new ArrayList<>(cur));
            return;
        }else {
            for(int i=start;i<=n;i++){
                cur.add(i);
                dfs(res,k-1,cur,n,i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int n = 4;
        int k = 2;
        List<List<Integer>> res = combine(n,k);
        System.out.println(res);
    }
}
