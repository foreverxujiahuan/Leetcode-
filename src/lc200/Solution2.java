package lc200;

public class Solution2 {
    public static int numIslands(char[][] grid){
        int res = 0;
        int m = grid.length;
        if(m==0){
            return 0;
        }
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    res = res+1;
                }
            }
        }
        return res;
    }
    private static void dfs(int i,int j,char[][] grid){
        grid[i][j] = '0';
        int m = grid.length;
        int n = grid[0].length;
        if(i+1<m&&grid[i+1][j]=='1') dfs(i+1,j,grid);
        if(j-1>=0&&grid[i][j-1]=='1') dfs(i,j-1,grid);
        if(j+1<n&&grid[i][j+1]=='1') dfs(i,j+1,grid);
        if(i-1>=0&&grid[i-1][j]=='1') dfs(i-1,j,grid);
        return;
    }
    public static void main(String[] args){
        char[][] gird = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        char [][] g = {};
        System.out.println(numIslands(g));
    }
}
