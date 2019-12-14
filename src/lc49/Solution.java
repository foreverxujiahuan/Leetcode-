package lc49;

import java.util.*;

public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs){
        int l = strs.length;
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<l;i++){
            int ll = res.size();
            int flag=0;
            int index = 0;
            String temp = sort(strs[i]);
            for(int j=0;j<ll;j++){
                if(sort(res.get(j).get(0)).equals(temp)){
                    flag=1;
                    index = j;
                    break;
                }
            }
            if(flag==1){
                res.get(index).add(strs[i]);
            }else {
                List<String> tt = new ArrayList<>();
                tt.add(strs[i]);
                res.add(tt);
            }
        }
        return res;
    }
    private static String sort(String s){
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        String res = String.valueOf(temp);
        return res;
    }
    public static void main(String[] args){
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s);
    }
}
