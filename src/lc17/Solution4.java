package lc17;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Solution4 {
    public static void main(String[] args){
        Hashtable<Character,String> hs = new Hashtable<>();
        String digits = "23";
        System.out.println(leeterCombinations(digits));
    }
    public static List<String> leeterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()){
            return res;
        }
        Hashtable<Character,String> hs = new Hashtable<>();
        hs.put('2',"abc");
        hs.put('3',"def");
        hs.put('4',"ghi");
        hs.put('5',"jkl");
        hs.put('6',"mno");
        hs.put('7',"pqrs");
        hs.put('8',"tuv");
        hs.put('9',"wxyz");
        StringBuilder cur = new StringBuilder("");
        int index = 0;
        dfs(digits,hs,res,cur,index);
        return res;
    }
    private static void dfs(String digits,Hashtable<Character,String> hs,List<String> res,StringBuilder cur,int index){
        if(digits.length()==index){
            res.add(cur.toString());
            return;
        }
        String temp = hs.get(digits.charAt(index));
        int l = temp.length();
        for(int i=0;i<l;i++){
            cur.append(temp.charAt(i));
            dfs(digits,hs,res,cur,index+1);
            cur.delete(cur.length()-1,cur.length());
        }
    }
}
