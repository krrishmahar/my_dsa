package Java_DSA.Tree.SelfBalancingBT;

public class AVLTree {
    class Node{
        private final int value;
        int height;
        Node left;
        Node right;
        public Node(int value){
            this.value = value; this.height=0;
        }
        public int getValue(){  return value;   }
        public int getHeight(){ return height;  }
    }

    private Node root;
    public AVLTree(){}
    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }
    private boolean isEmpty(Node node){ return node == null; }
    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (isEmpty(node)){
            node = new Node(value);
            return node;
        }
        if (value < node.value){
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1){
            //only 2 cases - left heavy
            if (height(node.left.left) - height(node.left.right) >= 0){
                // left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0){
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1){
            //only 2 cases - right heavy
            if (height(node.right.left) - height(node.right.right) < 0){
                // right-right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) >= 0){
                // right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t2 = p.left;

        p.left = c;
        c.right = t2;
        //update the heights    //FIX: Update child 'c' FIRST, then parent 'p'
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return p;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t2 = c.right;

        c.right = p;
        p.left = t2;
        //update the heights    //FIX: Update child 'p' FIRST, then parent 'c'
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    public void populate(int[] nums){
        for (int num : nums){
            this.insert(num);
        }
    }

    public void display(){
        System.out.println("----------------------------");
        display(this.root, 0);
        System.out.println("----------------------------");
    }

    private void display(Node node , int level) {
        if (isEmpty(node)){
            return;
        }
        display(node.right, level+1);
        if (level != 0){
            for (int i =0; i< level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.getValue());
        } else{
            System.out.println(node.getValue());
        }
        display(node.left, level+1);
    }
}
