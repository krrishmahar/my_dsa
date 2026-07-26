package practice.tree;

public class CousinInBT {
    //
    public Boolean isCousins(TreeNode root, int x, int y){
        TreeNode xNode = findNode(root, x);
        TreeNode yNode = findNode(root, y);

        return (level(root,xNode, 0) == level(root, yNode, 0)) && (!isSibling(root, xNode, yNode));
    }
    private TreeNode findNode(TreeNode node, int x){
        if (node == null)   return  null;
        if (node.val == x)  return node;
        TreeNode left = findNode(node.left, x);
        return (left != null) ? left : findNode(node.right, x);
    }
    public int level(TreeNode node, TreeNode x, int level){
        if (node == null)   return 0;
        if (node == x)      return level;
        int l = level(node.left, x, level+1);
        return (l != 0) ? l : level(node.right, x, level+1);

    }
    public boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        if (node == null)   return false;
        return ((node.left == x) && (node.right == y))
                || ((node.left == y) && (node.right == x))
                || isSibling(node.left,x,y) || isSibling(node.right,x,y);
    }
}
