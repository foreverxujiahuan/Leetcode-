package lc976;

import java.util.Arrays;

public class Solution {
    public static int largestPerimeter(int[] A){
        int l = A.length;
        Arrays.sort(A);
        int res=0;
        for(int i=0;i<l-2;i++){
            int a = A[i];int b = A[i+1];int c = A[i+2];
            if(flag(a,b,c)){
                if(res<a+b+c) res = a+b+c;
            }
        }
        return res;
    }
    private static boolean flag(int a,int b,int c){
        if(a+b>c&&a+c>b&&b+c>a) return true;
        return false;
    }
    public static void main(String[] args){
        int A[] = {3,2,3,4};
        System.out.println(largestPerimeter(A));
    }
}
