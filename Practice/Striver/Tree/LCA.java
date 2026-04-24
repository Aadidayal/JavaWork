package Practice.Striver.Tree;

import javax.swing.tree.TreeNode;



public class LCA {
     public class TreeNode {
    int val;
     TreeNode left;
      TreeNode right;
    TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        
    }

    // for Binary tree
        class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if( root==null || root==p || root==q){
                return root;
            }   
        TreeNode left= lowestCommonAncestor(root.left,p,q);
            TreeNode right =lowestCommonAncestor(root.right,p,q);
            if(left !=null && right !=null){
                return root;
            }
            if(left!=null){
                return left;
            }   

                return right;   
            
        
            }
        
    }



    // for BST

    class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;   // go left
            } 
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;  // go right
            } 
            else {
                return root; // split happens → LCA
            }
        }
        return null;
    }
}
}
