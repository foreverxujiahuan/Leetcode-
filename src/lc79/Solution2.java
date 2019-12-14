package lc79;

public class Solution2 {
    public boolean exist(char[][] board,String word){
        int rows = board.length;
        int cols = board[0].length;
        boolean visit[][] = new boolean[rows][cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(dfs(rows,cols,row,col,0,visit,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(int rows,int cols,int row,int col,int k,boolean visit[][],char[][] board,String word){
        if(row<0||col<0||row>=rows||col>=cols||visit[row][col]||word.charAt(k)!=board[row][col]){
            return false;
        }
        visit[row][col] = true;
        if(k==word.length()-1){
            return true;
        }
        k++;
        if(dfs(rows,cols,row+1,col,k,visit,board,word)||
            dfs(rows,cols,row,col+1,k,visit,board,word)||
            dfs(rows,cols,row-1,col,k,visit,board,word)||
            dfs(rows,cols,row,col-1,k,visit,board,word)){
            return true;
        }
        visit[row][col] = false;
        return false;
    }
}
