package lc104;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDepth(TreeNode root){
        int leng = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int l = queue.size();
            for(int i=0;i<l;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            leng=leng+1;
        }
        return leng;
    }
}
