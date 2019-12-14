package lc03;

public class Solution2 {
    public static int lengthOfLongestSubstring(String s){
        int start = 0;
        int max=0;
        for(int i=0;i<s.length();i++){
            String t = s.substring(start,i);
            if(t.contains(s.substring(i,i+1))){
                start = start+1;
                i--;
            }
            max = Math.max(i-start+1,max);
        }
        return max;
    }
    public static void main(String[] args){
        String s = new String("pwwkew");
        System.out.println(lengthOfLongestSubstring(s));
    }
}
