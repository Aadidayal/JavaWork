package Questions;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    
    Queue<TreeNode> q = new LinkedList<>();
    
    q.offer(root);
    
    
    while (!q.isEmpty()) {
        int size = q.size();
        List<Integer> currentLevel = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            TreeNode node = q.poll();
            currentLevel.add(node.val);

            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        result.add(currentLevel);
    }

    return result;
}
