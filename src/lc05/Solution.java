package lc05;

public class Solution {
    public static String longestPalindrome(String s){
        if(s==null||s.length()<1){
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int l1 = expandAroundCenter(s,i,i);
            int l2 = expandAroundCenter(s,i,i+1);
            int l = Math.max(l1,l2);
            if(l>end-start){
                start = i-(l-1)/2;
                end = i+l/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int expandAroundCenter(String s,int left,int right){
        int L = left;
        int R = right;
        while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L=L-1;
            R=R+1;
        }
        return R-L-1;
    }
    public static void main(String[] args){
        String s = "babad";
        String res = longestPalindrome(s);
        System.out.println(res);
    }
}
