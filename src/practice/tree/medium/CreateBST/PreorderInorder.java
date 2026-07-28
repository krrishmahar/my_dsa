package practice.tree.medium.CreateBST;

import practice.tree.PracticeBST;
import practice.tree.TreeNode;

import java.util.Arrays;

public class PreorderInorder {
//    https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/
//    https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/


/*    To build a tree, we need to know what the root is, what goes to the left, and what goes to the right.
      Preorder Traversal (Root -> Left -> Right): The very first element is always the root of the tree.
      Inorder Traversal (Left -> Root -> Right): Once we know what the root is, we can find it in the Inorder array.
      Everything to the left of that index belongs to the left subtree, and
      everything to the right belongs to the right subtree.
      Example: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
      Root is 3 (first element in preorder).
      Find 3 in inorder. It's at index 1. Left subtree nodes: [9] Right subtree nodes: [15, 20, 7]*/
    /* Time Complexity: O(n2)*/
    /* Space Complexity: O(n2)*/
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0)    return null;
        int root = preorder[0];
        int index =0;
        for (int i=0; i< inorder.length; i++){
            if (inorder[i] == root){    //O(n) time
                index = i;
            }
        }
        TreeNode node = new TreeNode(root);
        //copyOf ops takes O(n) time
        //Recursion stack for both node.left and node.right take O(n) each = O(n2)
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));

        return node;
    }

    static void main() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder  = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        PracticeBST tree = new PracticeBST(root);
        tree.display();

    }
}
