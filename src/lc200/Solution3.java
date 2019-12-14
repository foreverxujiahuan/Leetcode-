package lc200;

public class Solution3 {
    public static int numIslands(char[][] grid){
        int res = 0;
        int n = grid.length;
        if(n==0) return 0;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    res++;
                }
            }
        }
        return res;
    }
    private static void dfs(int x,int y,char[][] grid){
        grid[x][y] = '0';
        int n = grid.length;
        int m = grid[0].length;
        if(x+1<n&&grid[x+1][y]=='1') dfs(x+1,y,grid);
        if(y-1>=0&&grid[x][y-1]=='1') dfs(x,y-1,grid);
        if(x-1>=0&&grid[x-1][y]=='1') dfs(x-1,y,grid);
        if(y+1<m&&grid[x][y+1]=='1') dfs(x,y+1,grid);
    }
}
