package practice.tree.easy;

import practice.tree.TreeNode;

public class InvertBinaryTree {
//    Time Complexity = O(n)
//    Space Complexity= O(log n)
//    Since atmax height of recursion stack can be height of recursion Tree
//    since no two nodes of same level can be present in stack at same time
//    Hence, it will be O(H) H->heigght or O(log n) in binary tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right= left;
        return root;
    }
}
