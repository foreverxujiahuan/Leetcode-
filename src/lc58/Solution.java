package lc58;

public class Solution {
    public static int lengthOfLastWord(String s){
        String[] strArray = new String[11];
        strArray = s.split(" ");
        int l = strArray.length;
        if(l>=1){
            return strArray[l-1].length();
        }
        return 0;
    }
    public static void main(String[] args){
        String s = new String(" hello");
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }
}
