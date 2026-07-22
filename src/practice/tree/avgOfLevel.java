package practice.tree;

import java.util.*;

public class avgOfLevel {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){ }
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val   = val;
            this.left  = left;
            this.right = right;
        }
    }

    //https://leetcode.com/problems/average-of-levels-in-binary-tree/
    public static  List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double avgLevel = 0;
            for (int i=0; i<levelSize; i++){
                TreeNode currNode =  queue.poll();
                avgLevel += currNode.val;
                if (currNode.left != null){
                    queue.offer(currNode.left);
                }

                if (currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            avgLevel /= levelSize;
            result.add(avgLevel);
        }
        return result;
    }
}
