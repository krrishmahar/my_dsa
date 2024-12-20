package Java_DSA.LinkedList;

public class doubly {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node; // Update the previous reference of the old head
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
            last = node;
        }
        System.out.println("END");

//        System.out.println("Print in reverse");
//        while (last != null){
//            System.out.print(last.val + " -> ");
//            last = last.prev;
//        }
//        System.out.println("Start");
    }


    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null; // New node will be the last node, so its next should be null

        if (head == null) { // If the list is empty, make the new node the head
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) { // Traverse to the last node
            last = last.next;
        }
        last.next = node; // Set the next of the last node to the new node
        node.prev = last; // Set the previous of the new node to the last node
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after, int val) {

        Node p = find(after);
        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }


    }


    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public static void main(String[] args) {

        doubly list = new doubly();

        list.insertFirst(15);
        list.insertFirst(116);
        list.insertFirst(10);
        list.insertFirst(179);
        list.insertLast(99);
        list.insertLast(100);
        list.insert(2, 32);
        list.display();
//        System.out.println(list.delete(2));
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteFirst());
//        list.display();


    }

}
