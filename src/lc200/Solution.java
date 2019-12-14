package lc200;

public class Solution {
    public static int numIslands(char[][] grid){
        if(grid.length==0) return 0;
        int l = grid.length;
        int w = grid[0].length;
        int res = 0;
        for(int i=0;i<l;i++){
            for(int j=0;j<w;j++){
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
        int m = grid.length;
        int n = grid[0].length;
        if(x-1>=0&&grid[x-1][y]=='1') dfs(x-1,y,grid);
        if(x+1<=m-1&&grid[x+1][y]=='1') dfs(x+1,y,grid);
        if(y-1>=0&&grid[x][y-1]=='1') dfs(x,y-1,grid);
        if(y+1<=n-1&&grid[x][y+1]=='1') dfs(x,y+1,grid);
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
        int res = numIslands(gird);
        System.out.println(res);
        int res2 = numIslands(grid2);
        System.out.println(res2);
    }
}
