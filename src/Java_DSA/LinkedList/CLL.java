package Java_DSA.LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node node = head;
        Node Head = node;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println(Head.val);
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        CLL list = new CLL();
        list.insert(15);
        list.insert(116);
        list.insert(10);
        list.insert(179);
        list.insert(99);
        list.display();
        list.delete(179);
        list.delete(99);
        list.insert(100);
        list.display();
    }

}
