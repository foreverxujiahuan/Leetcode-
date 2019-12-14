package lc22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        help("",res,n,0,0);
        return res;
    }
    public static void help(String cur,List<String> res,int n,int left,int right){
        if(n==right){
            res.add(cur);
            return;
        }
        if(left<n){
            help(cur+"(",res,n,left+1,right);
        }
        if(left>right){
            help(cur+")",res,n,left,right+1);
        }
    }
    public static void main(String[] args){
        int n=3;
        List<String> res= generateParenthesis(n);
        System.out.println(res);
    }
}
