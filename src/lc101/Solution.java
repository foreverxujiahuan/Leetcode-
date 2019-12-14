package lc101;

public class Solution {
    public boolean isSymmetric(TreeNode root){
        if(root==null) return true;
        return issametree(root.left,root.right);
    }
    private boolean issametree(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val==q.val) return issametree(p.left,q.right)&&issametree(p.right,q.left);
        return false;
    }
}
