package lc985;

public class Solution {
    public static int[] sumEvenAfterQueries(int[] A,int[][] queries){
        int l = queries.length;
        int[] res = new int[l];
        for(int i=0;i<l;i++){
            int t=0;
            A[queries[i][1]] = A[queries[i][1]]+queries[i][0];
            for(int j=0;j<A.length;j++){
                if(A[j]%2==0){
                    t = t+A[j];
                }
            }
            res[i] = t;
        }
        return res;
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] res = sumEvenAfterQueries(A,queries);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(res[3]);
    }
}
