package Java_DSA.Tree.SelfBalancingBT;

public class Main {
    static void main() {
        // Example 1: Triggering a Right Rotation (Left-Left Case)
        System.out.println("--- Test 1: Left-Left Heavy ---");
        AVLTree tree1 = new AVLTree();
        int[] leftHeavyData = {30, 20, 10}; // Inserting in descending order
        tree1.populate(leftHeavyData);
        System.out.println("Tree 1 populated. Root should now be 20.");

        // Example 2: Triggering a Left Rotation (Right-Right Case)
        System.out.println("\n--- Test 2: Right-Right Heavy ---");
        AVLTree tree2 = new AVLTree();
        int[] rightHeavyData = {10, 20, 30}; // Inserting in ascending order
        tree2.populate(rightHeavyData);
        System.out.println("Tree 2 populated. Root should now be 20.");

        // Example 3: Triggering a Left-Right Rotation
        System.out.println("\n--- Test 3: Left-Right Heavy ---");
        AVLTree tree3 = new AVLTree();
        int[] leftRightData = {30, 10, 20}; // Zig-zag insertion
        tree3.populate(leftRightData);
        System.out.println("Tree 3 populated. Root should now be 20.");

        // Example 4: A larger, mixed dataset
        System.out.println("\n--- Test 4: Mixed Data ---");
        AVLTree tree4 = new AVLTree();
        int[] mixedData = {15, 10, 20, 5, 12, 18, 25, 4, 8};
        tree4.populate(mixedData);
        System.out.println("Tree 4 populated and successfully self-balanced!");
        tree4.display();
    }
}
