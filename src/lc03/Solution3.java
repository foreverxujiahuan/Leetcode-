package lc03;

public class Solution3 {
    public static int lemgthOfLongestSubstring(String s){
        int max = 0;
        int l = s.length();
        int begin = 0;
        for(int i=0;i<l;i++){
            String s2 = s.substring(begin,i);
            if(s2.contains(s.substring(i,i+1))){
                begin=begin+1;
                i=i-1;
            }
            max = Math.max(max,i-begin+1);
        }
        return max;
    }
    public static void main(String[] args){
        String s = "bbbb";
        int res = lemgthOfLongestSubstring(s);
        System.out.println(res);
    }
}
