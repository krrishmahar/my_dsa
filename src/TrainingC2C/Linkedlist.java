package TrainingC2C;

import Java_DSA.LinkedList.LinkedListie;

public class Linkedlist {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    final int SIZE = 0;
    public Linkedlist(){}

    public Linkedlist(Node head) {
        this.head = head;
        Node node = new Node(head.val);
    }
    public void insert(int index, int val){
        if (head == null || index == 0){
            prepend(val);
            SIZE++;
        }
        if (index == SIZE){
            extend(val);
            SIZE++;
        }


        LinkedListie.Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        LinkedListie.Node node = new LinkedListie.Node(val);
        node.next = temp.next;
        SIZE++;

    }
}
