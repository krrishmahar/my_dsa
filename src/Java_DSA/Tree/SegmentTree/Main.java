package Java_DSA.Tree.SegmentTree;

public class Main {
    static void main(String[] args){
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();
        System.out.println(tree.query(4,5));

    }
}
