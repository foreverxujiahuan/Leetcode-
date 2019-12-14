package lc69;

public class Solution {
    public static int mySqrt(int x){
        if(x <= 0) return 0;
        int l = 1, r = x, res = 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(mid > x/mid) {
                r = mid;
            } else {
                res = mid;
                l = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n=8;
        int res = mySqrt(n);
        System.out.print(res);
    }
}
