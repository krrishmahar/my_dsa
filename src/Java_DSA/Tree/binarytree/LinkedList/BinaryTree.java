package Java_DSA.Tree.binarytree.LinkedList;

import java.util.Scanner;

class BinaryTree {
    //Trees are most important topic in DS
    //Trees and Recursion are most imp topics of interview
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    public BinaryTree(){
        this.root = null;
    }

    private Node root;

    // Public method to kick off the insertion process
    public void populate() {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.print("Enter the root node value: ");
            String input = sc.next();
            int val = Integer.parseInt(input);
            root = new Node(val);
            // Recursively populate the rest of the tree
            populateRecursive(sc, root);
        } catch (NumberFormatException e) {
            System.out.println("Invalid root value. Tree creation aborted.");
        }
    }

    // Helper method handling the left and right child recursive prompts
    private void populateRecursive(Scanner sc, Node currentNode) {
        // 1. Handle Left Child
        System.out.printf("Enter left child of %d (or '-' to skip): ", currentNode.value);
        String leftInput = sc.next();
        if (!leftInput.equals("-")) {
            try {
                int leftVal = Integer.parseInt(leftInput);
                currentNode.left = new Node(leftVal);
                populateRecursive(sc, currentNode.left); // Drill down left
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, skipping left child.");
            }
        }

        // 2. Handle Right Child
            System.out.printf("Enter right child of %d (or '-' to skip): ", currentNode.value);
            String rightInput = sc.next();
            if (!rightInput.equals("-")) {
                try {
                    int rightVal = Integer.parseInt(rightInput);
                    currentNode.right = new Node(rightVal);
                    populateRecursive(sc, currentNode.right); // Drill down right
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, skipping right child.");
                }
        }
    }

    // Quick display method to verify your tree construction works
    public void display() {
        displayRecursive(root, 0);
    }

    private void displayRecursive(Node node, int level) {
        if (node == null) return;
        displayRecursive(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) System.out.print("|\t");
            System.out.println("|-------" + node.value);
        } else {
            System.out.println(node.value);
        }
        displayRecursive(node.left, level + 1);
    }

    static void main() {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println("\nYour Binary Tree structure (rotated 90 degrees):");
        tree.display();
    }

}
