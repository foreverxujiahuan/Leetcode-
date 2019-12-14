package lc13;

import java.util.HashMap;

public class Solution {
    public static int romanToInt(String s){
        HashMap<Character,Integer> temp = new HashMap<>();
        temp.put('I',1);
        temp.put('V',5);
        temp.put('X',10);
        temp.put('L',50);
        temp.put('C',100);
        temp.put('D',500);
        temp.put('M',1000);
        int l = s.length();
        StringBuilder t = new StringBuilder("");
        for(int i=l-1;i>=0;i--){
            t.append(s.charAt(i));
        }
        int res = temp.get(t.charAt(0));
        for(int i=1;i<l;i++){
            if(temp.get(t.charAt(i))<temp.get(t.charAt(i-1))){
                res = res-temp.get(t.charAt(i));
            }else {
                res = res+temp.get(t.charAt(i));
            }
        }
        return res;
    }
    public static void main(String[] args){
        String t = new String("LVIII");
        int n = romanToInt(t);
        System.out.println(n);
    }
}
