package lc113;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(root,sum,temp,res);
        return res;
    }
    private static void dfs(TreeNode root,int sum,List<Integer> temp,List<List<Integer>> res){
        if(root==null){
            return;
        }
        temp.add(root.val);
        sum = sum-root.val;
        if(root.left==null&&root.right==null){
            if(sum==0){
                res.add(new ArrayList<Integer>(temp));
            }
        }else {
            if(root.left!=null){
                dfs(root.left,sum,temp,res);
            }if(root.right!=null){
                dfs(root.right,sum,temp,res);
            }
        }
        temp.remove(temp.size()-1);
    }
}
