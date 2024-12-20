package Java_DSA.Tree;

public class BST {
    public class Node {
        private int value;
        private int height;
        private Node left, right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    public BST() {
    }

    public int height(Node node){
        if(node == null) return 0;
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insertMany(int[] arr){
        if (arr == null || arr.length == 0) return;
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
    }
    public void insertManySorted(int[] arr){
        if (arr == null || arr.length == 0) return;

        insertManySorted(arr, 0, arr.length);
    }

    private void insertManySorted(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = (end + start) / 2;
        insert(arr[mid]);
        insertManySorted(arr, start, mid - 1);
        insertManySorted(arr, mid + 1, end);
    }

    public void insert(int value){
        root = insert(value, root);
    }
    Node insert(int value, Node node){
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) return true;
        return Math.abs( height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) return;
        System.out.println(details + node.getValue());

        display(node.left," Left child of " + node.getValue() + " : ");
        display(node.right," Right child of " + node.getValue() + " : ");

    }

    public static void preOrder(Node node){
        if (node == null) return;
        System.out.print(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if (node == null) return;
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if (node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.getValue() + " ");
    }

    public static void main(String[] args) {
//        BST bst = new BST();
//        bst.insertManySorted(new int[]{1,2,3,4,5,6,7,8,9,10});
//        bst.insertMany(new int[]{15,10,20,5,12,8,4,18,16});
//        bst.display();
        BST pbst = new BST();
        pbst.insertMany(new int[]{10,5,20,3,8,2});
        pbst.display();
//        preOrder(pbst.root);
        System.out.println();
        pbst.inOrder(pbst.root);
        System.out.println();
//        postOrder(pbst.root);
    }

}
