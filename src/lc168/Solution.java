package lc168;

import java.util.Hashtable;

public class Solution {
    public static String converToTitle(int n){
        String s = "";
        while (n != 0) {
            int temp = (n-1)%26;
            s = (char)('A'+temp)+s;
            n = (n-1)/26;
        }
        return s;
    }
    public static void main(String[] args){
        int n = 703;
        String res = converToTitle(n);
        System.out.println(res);
        char s = (char)('A'+1);
        System.out.println(s);
    }
}
