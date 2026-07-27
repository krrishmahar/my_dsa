package practice.tree.medium;

import practice.tree.TreeNode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
//Time Complexity: O(n)
//Space Complexity: O(H) or O(log n)
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //LowestCommonAncestor can be a node itself
        if (root == null)   return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);

        if (left != null && right != null)  return root;
        return left == null ? right : left;
    }
}
