package lc76;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minWindow(s,t);
        System.out.println(res);
    }
    public static String minWindow(String s,String t){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,1);
            }else {
                map.put(key,map.get(key)+1);
            }
        }
        int count = t.length();
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;
        while (right<s.length()){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0){
                    count--;
                }
            }
            while (count==0){
                if(right-left<min){
                    minLeft = left;
                    minRight = right;
                    min = minRight - minLeft;
                }
                char c2 = s.charAt(left);
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)>0){
                        count++;
                    }
                }
                left++;
            }
            right++;
        }
        return (min == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minRight + 1);
    }
}
