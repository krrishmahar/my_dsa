package Java_DSA.Tree.binarytree.LinkedList;

import java.util.List;

class Node{
    private final int value;
    int height;
    Node left;
    Node right;

    public Node(int value){
        this.value = value; this.height = 0;
    }
    public int getValue(){
        return value;
    }

}

public class BinarySearchTree {

    private Node root;
    public BinarySearchTree(){}

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return isEmpty(root);
    }
    private boolean isEmpty(Node node){
        return node == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String str) {
        if (isEmpty(node))  return;
        System.out.println(str + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ":\t");
        display(node.right, "Right child of " + node.getValue() + ":\t");
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if (isEmpty(node)){
            node = new Node(value);
            return node;
        }
        if (value < node.getValue()){
            node.left = insert(value, node.left);
        } else if (value > node.getValue()) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) +1;
        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if (isEmpty(node)){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right))<= 1
                && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums){
        for (int num : nums){
            this.insert(num);
        }
    }

    public void populateSorted(List<Integer> list){
        populateSorted(list, 0, list.size());
    }

    private void populateSorted(List<Integer> list, int s, int e) {
        if ( s >= e ){
            return;
        }
        int mid = s + (e-s)/2; // O(1)
        this.insert(list.get(mid)); //O(n)
        populateSorted(list, s, mid); // O(log n) left
        populateSorted(list, mid+1, e); // O(log n) right
///        Total Time Complexity -> O(n * log n)
    }

    public void traverse(TraversalType type){
        switch (type){
            case PRE_ORDER -> preOrder(root);
            case IN_ORDER -> inOrder(root);
            case POST_ORDER -> postOrder(root);
        }
    }

    private void preOrder(Node node) {
        if (isEmpty(node)){
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left); // Fixed: was calling preOrder
        System.out.print(node.getValue() + " ");
        inOrder(node.right); // Fixed: was calling preOrder
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue() + " ");
    }

}
