package lc09;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int n = x;
        List<Integer> temp = new LinkedList<>();
        while (n>0){
            temp.add(n%10);
            n=n/10;
        }
        int l = temp.size();
        for(int i=0;i<l/2;i++){
            int a = temp.get(i);
            int b = temp.get(l-i-1);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = -121;
        System.out.println(isPalindrome(n));
    }
}
