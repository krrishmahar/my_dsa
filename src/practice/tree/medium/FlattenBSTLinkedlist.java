package practice.tree.medium;

import practice.tree.TreeNode;

public class FlattenBSTLinkedlist {
    public void flatten(TreeNode root) {
        if (root == null)   return;
        TreeNode curr = root;
        while (curr != null){
            //find rightmost element from left -> right subtree
            if (curr.left != null){
                TreeNode temp = curr.left;
                while (temp.right != null){
                    temp = temp.right;
                }

                temp.right = curr.right;
                curr.right = curr.left;
                curr.left  = null;
            }
            curr = curr.right;
        }
    }
}
