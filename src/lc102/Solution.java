package lc102;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.push(root);
        while (!dq.isEmpty()){
            int l = dq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode node = dq.pop();
                temp.add(node.val);
                if(node.left!=null){
                    dq.addLast(node.left);
                }
                if(node.right!=null){
                    dq.addLast(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
