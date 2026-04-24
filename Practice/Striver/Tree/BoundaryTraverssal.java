package Practice.Striver.Tree;

import java.util.ArrayList;

public class BoundaryTraverssal {
    class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
    public static void main(String[] args) {
        
    }
    class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        if (!isLeaf(root)) ans.add(root.data); // root

        lefty(root.left, ans);   // left boundary
        leaves(root, ans);       // all leaves
        righty(root.right, ans); // right boundary

        return ans;
    }

    private void lefty(Node root, ArrayList<Integer> ans) {
        if (root == null || isLeaf(root)) return;

        ans.add(root.data);

        if (root.left != null) lefty(root.left, ans);
        else lefty(root.right, ans);
    }

    private void righty(Node root, ArrayList<Integer> ans) {
        if (root == null || isLeaf(root)) return;

        if (root.right != null) righty(root.right, ans);
        else righty(root.left, ans);

        ans.add(root.data); // add AFTER recursion (reverse)
    }

    private void leaves(Node root, ArrayList<Integer> ans) {
        if (root == null) return;

        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        leaves(root.left, ans);
        leaves(root.right, ans);
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
}
}
