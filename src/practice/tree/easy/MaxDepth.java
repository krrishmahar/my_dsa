package practice.tree.easy;

import practice.tree.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        //Time Complexity = O(n)
        //Space Complexity = O(log n)
        if (root == null)   return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // Above one is better
    public int maxDepth2(TreeNode root) {
        //Same as  other but helper function
        if (root == null)   return 0;
        return height(root);
    }
    private int height(TreeNode node){
        if (node == null)   return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);
        return Math.max(leftH, rightH)+1;
    }
}
