package lc17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<String> leeterCombinations(String digits){
        HashMap<String,String> phone = new HashMap<>();
        phone.put("1","");
        phone.put("2","abc");
        phone.put("3","def");
        phone.put("4","ghi");
        phone.put("5","jkl");
        phone.put("6","mno");
        phone.put("7","pqrs");
        phone.put("8","tuv");
        phone.put("9","wxyz");
        List<String> pre = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        int l = digits.length();
        if(l==0){
            return cur;
        }
        String s = phone.get(digits.substring(0,1));
        for(int i=0;i<s.length();i++){
            pre.add(s.substring(i,i+1));
        }
        for(int i=1;i<l;i++){
            String t = phone.get(digits.substring(i,i+1));
            int ll = t.length();
            for(int j=0;j<pre.size();j++){
                for(int k=0;k<ll;k++){
                    String q = pre.get(j).concat(t.substring(k,k+1));
                    cur.add(q);
                }
            }
            pre = cur;
        }
        return pre;
    }
    public static void main(String[] args){
        String digits = "222";
        List<String> res = leeterCombinations(digits);
        System.out.println(res);
    }
}