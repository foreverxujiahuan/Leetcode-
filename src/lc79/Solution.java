package lc79;

public class Solution {
    public static boolean exist(char[][] board,String word){
        int rows = board.length;
        int cols = board[0].length;
        boolean visit[][] = new boolean[rows][cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(dfs(rows,cols,row,col,visit,0,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(int rows,int cols,int row,int col,boolean visit[][],int k,String word,char[][] board){
        if(row<0||col<0||row>=rows||col>=cols||board[row][col]!=word.charAt(k)||visit[row][col]){
            return false;
        }
        visit[row][col] = true;
        if(k==word.length()-1){
            return true;
        }
        k++;
        if (dfs(rows,cols,row+1,col,visit,k,word,board)||
                dfs(rows,cols,row,col+1,visit,k,word,board)||
                dfs(rows,cols,row-1,col,visit,k,word,board)||
                dfs(rows,cols,row,col-1,visit,k,word,board)
        ){
            return true;
        }
        visit[row][col] = false;
        return false;
    }
}
