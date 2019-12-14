package lc22;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args){
        int n = 5;
        List<String> res = generateParenthesis(n);
        System.out.println(res);
    }
    public static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        dfs("",res,n,0,0);
        return res;
    }
    private static void dfs(String cur,List<String> res,int n,int left,int right){
        if(n==right){
            res.add(cur);
            return;
        }
        if(left<n){
            dfs(cur+"(",res,n,left+1,right);
        }
        if(left>right){
            dfs(cur+")",res,n,left,right+1);
        }
    }
}
