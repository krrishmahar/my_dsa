package practice.tree.easy.PathSum;

import practice.tree.TreeNode;

public class MaxSumPath {
//    https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        ans = helper(root);
        return ans;
    }
    private int helper(TreeNode node){
        if (node == null)   return 0;
        int left = helper(node.left);
        int right= helper(node.right);
        left = Math.max(0, left);
        right= Math.max(0, right);
        int pathSum = left+right+ node.val;
        ans = Math.max(ans, pathSum);
        return Math.max(left, right) + node.val;
    }
}
