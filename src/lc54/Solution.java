package lc54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        if(row==0){
            return res;
        }
        int col = matrix[0].length;
        int right = col-1;
        int left = 0;
        int down = row-1;
        int up = 0;
        int k = 1;
        while (k<=col*row){
            for(int i=left;i<=right&&k<=col*row;i++){
                res.add(matrix[up][i]);
                k=k+1;
            }
            for (int i = up+1;i<=down-1&&k<=col*row;i++){
                res.add(matrix[i][right]);
                k=k+1;
            }
            for (int j = right; j>=left &&k<=col*row; j--) {
                res.add(matrix[down][j]);
                k=k+1;
            }
            for (int i = down-1; i>=up+1 &&k<=col*row; i--) {
                res.add(matrix[i][left]);
                k=k+1;
            }
            left = left+1;
            right = right-1;
            up = up+1;
            down = down-1;
        }
        return res;
    }
}
