package lc50;

public class Solution {
    public static double myPow(double x,int n){
        double res;
        res = Math.pow(x,n);
        if(n>=Math.pow(-2.0,31)&&n<=Math.pow(2.0,31)-1){
            return res;
        }
        return 0;
    }
    public static void main(String[] args){
        double x = 2.1;
        int n = 3;
        double res = myPow(x,n);
        System.out.print(res);
    }
}
