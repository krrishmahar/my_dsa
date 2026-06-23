package Java_DSA.Tree.binarytree;

import Java_DSA.Tree.binarytree.LinkedList.BinarySearchTree;
import Java_DSA.Tree.binarytree.LinkedList.TraversalType;

public class Main {

    static void main() {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = { 5,2,7,1,4,6,9,8,3,10 };
        int[] nums2 = {4, 2, 6, 1, 3, 5, 7};    // Perfectly Ordered BST
        bst.populate(nums2);
//        System.out.println(bst.isBalanced());
//        bst.display();
        System.out.println("---------------------------------------------------");
        System.out.print("PRE-ORDER TRAVERSAL- \t");    bst.traverse(TraversalType.PRE_ORDER);
        System.out.print("\nIN-ORDER TRAVERSAL- \t");   bst.traverse(TraversalType.IN_ORDER);   //Traverse BST in sorted order
        System.out.print("\nPOST-ORDER TRAVERSAL-\t");  bst.traverse(TraversalType.POST_ORDER);

//        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
//        List<Integer> list = Arrays.stream(nums2).boxed().toList();
//        BinarySearchTree bst2 = new BinarySearchTree();
//        bst2.populateSorted(list);
//        bst2.display();
//        System.out.println(bst2.isBalanced());



    }
}
