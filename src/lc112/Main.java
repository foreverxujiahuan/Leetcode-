package lc112;

public class Main {
    public static void main(String[] args){

    }
    public boolean hasPathSum(TreeNode root,int sum){
        return dfs(root,sum);
    }
    private static boolean dfs(TreeNode root,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null&&root.val==sum){
            return true;
        }
        return dfs(root.left,sum-root.val) || dfs(root.right,sum-root.val);
    }
}