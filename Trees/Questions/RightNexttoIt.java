package Questions;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightNexttoIt {
    public TreeNode findSuccessor(TreeNode root, int p) {
if(root==null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            TreeNode currNode = q.poll();
            if(currNode.left!=null) q.offer(currNode.left);
            if(currNode.right!=null) q.offer(currNode.right);
            if(currNode.val==p) break;
    }
        return q.peek();
    }
}