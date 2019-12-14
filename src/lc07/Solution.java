package lc07;

public class Solution {
    public static int reverse(int x){
        int t = Math.abs(x);
        long res = 0;
        while (t>0){
            res *= 10;
            res += t%10;
            if(res>Integer.MAX_VALUE){
                return 0;
            }
            t/=10;
        }
        return (int)(x>=0?res:-res);
    }
    public static void main(String[] args){
        int x = -2147483648;
        int res = reverse(x);
        System.out.println(res);
    }

}
