package practice.tree.easy;

import practice.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root.left);
        deque.add(root.right);
        while (!deque.isEmpty()){
            TreeNode left = deque.poll();
            TreeNode right = deque.poll();

            if (left == null && right == null){
                continue;
            }
            if (left == null || right == null){
                return false;
            }
            if (left.val != right.val){
                return false;
            }
            deque.add(left.left);
            deque.add(right.right);
            deque.add(left.right);
            deque.add(right.left);
        }
    return true;
    }
}
