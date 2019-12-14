package lc977;

import java.util.Arrays;

public class Solution {
    public static int[] sortedSquares(int[] A){
        int l = A.length;
        int[] res = new int[l];
        for(int i=0;i<l;i++){
            res[i] = A[i]*A[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args){
        int[] A = {-7,-3,2,3,11};
        int[] res = sortedSquares(A);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(res[3]);
        System.out.println(res[4]);
    }
}
