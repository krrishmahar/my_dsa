package Java_DSA.Tree;

public class SegmentTree {

    private class Node{
        private int data;
        private int startInterval;
        private int endInterval;
        private Node left, right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;
    public SegmentTree(int[] arr) {

    }
}
