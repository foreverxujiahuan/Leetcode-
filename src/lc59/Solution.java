package lc59;

public class Solution {
    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1, up = 0, down = n-1;
        int k = 1;
        while (k<=n*n) {
            for (int j = left; j<=right && k<=n*n; j++) {
                matrix[up][j] = k;
                k = k+1;
            }
            for (int i = up+1; i<=down-1 && k<=n*n; i++) {
                matrix[i][right] = k;
                k = k+1;
            }
            for (int j = right; j>=left && k<=n*n; j--) {
                matrix[down][j] = k;
                k = k+1;
            }
            for (int i = down-1; i>=up+1 && k<=n*n; i--) {
                matrix[i][left] = k;
                k = k+1;
            }
            left = left+1;
            right = right-1;
            up = up+1;
            down = down-1;
        }
        return matrix;
    }
    public static void main(String[] args){
        int n = 3;
        int[][] res = generateMatrix(n);
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
