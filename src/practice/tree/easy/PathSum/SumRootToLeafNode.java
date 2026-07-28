package practice.tree.easy.PathSum;

import practice.tree.TreeNode;

public class SumRootToLeafNode {
    //https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
    public int sumNumbers(TreeNode root){
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null)   return 0;

        sum *= 10 + node.val;
        if (node.left == null && node.right == null)
            return sum;

        return helper(node.left, sum) + helper(node.right, sum);
    }
}
