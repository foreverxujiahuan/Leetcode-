package lc03;
import java.util.HashSet;
import java.util.Set;
public class Solution {
    public static int lengthOfLongestSubstring(String s){
        int l = s.length();
        int start = 0;
        int maxlength = 0;
        for(int i=0;i<l;i++){
            String temp = s.substring(start,i);
            char t = s.charAt(i);
            start = start+temp.indexOf(t)+1;
            maxlength = Math.max(i-start+1,maxlength);
        }
        return maxlength;
    }
    public static void main(String[] args){
        String s = new String("abcabcbb");
        System.out.println(lengthOfLongestSubstring(s));
    }
}
