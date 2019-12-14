package lc28;

public class Solution {
    public  static int strStr(String haystack,String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = new String("");
        String needle = "aa";
        int res = strStr(haystack,needle);
        System.out.println(res);
    }
}
