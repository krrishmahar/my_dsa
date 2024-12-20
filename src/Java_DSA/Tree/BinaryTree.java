package Java_DSA.Tree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of "+ node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node "+ node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of "+ node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node "+ node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null)   return;

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.val);
        }else {
            System.out.println(node.val);
        }
        display(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }

}
