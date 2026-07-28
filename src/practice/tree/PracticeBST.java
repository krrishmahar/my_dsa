package practice.tree;

import java.security.PublicKey;

public class PracticeBST {
    protected TreeNode root;

    public PracticeBST(){}
    public PracticeBST(TreeNode root){
        this.root = root;
    }

    public void display(){
        display(root, "Root Node: ");
    }
    private void display(TreeNode node, String str){
        if (isEmpty(node))  return;
        System.out.println(str + node.val);
        display(node.left,"Left child: "+ node.val+":\t");
        display(node.right,"Right child: "+ node.val+":\t");

    }

    private boolean isEmpty(TreeNode node) {
        return node == null;
    }

}
