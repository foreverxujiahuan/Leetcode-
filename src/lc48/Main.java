package lc48;

public class Main {
    public void rotate(int[][] matrix){
        int l = matrix.length;
        int mid = l/2;
        for(int i=0;i<mid;i++){
            for(int j=0;j<l;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[l-1-i][j];
                matrix[l-1-i][j] = t;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}
