package lc98;

public class Solution {
    public static boolean isValidBST(TreeNode root){
        if(root==null){
            return true;
        }
        return dfs(root,null,null);
    }
    private static boolean dfs(TreeNode root,Integer max,Integer min){
        if(root==null) return true;
        if(max!=null&&root.val>=max) return false;
        if(min!=null&&root.val<=min) return false;
        boolean left = dfs(root.left,root.val,min);
        boolean right = dfs(root.right,max,root.val);
        return left&&right;
    }
}
