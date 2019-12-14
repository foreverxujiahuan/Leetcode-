package lc94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversak(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    private static void inorder(TreeNode root,List<Integer> temp){
        if(root==null) return;
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);
    }
}
