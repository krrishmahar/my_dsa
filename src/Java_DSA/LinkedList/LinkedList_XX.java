package Java_DSA.LinkedList;

import Algorithmns.Sort_Algo.BubbleSort_Algo;

public class LinkedList_XX {

    public Node head;
    protected Node tail; //creating this extra variable helps to directly insert at tail
    //hence, complexity is O(1)
    protected int size;

    public LinkedList_XX() {
        this.size = 0;
    }


    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.value; //to just fuckin' return it at end
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);// basically loops till size-2 then initiates secondlast as that noede
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        //return the desired node
        Node node = head;
        for (int i = 0; i < index; i++) {//traversing till desired node
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public class Node {


        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    //Sorting the  Linkedlist by bubble sort algo

    public void bubbleSort() {
        bubbleSort(size - 1, 0);

    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                //swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // Recursion Reverse:
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next); //going to end of the list
        // since, head is now tail
        tail.next = node;
        tail = node;
        tail.next = null;

    }


    //Inplace reversal of linkedlist:
    // asked in google, amazon, apple: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }


    public static void main(String[] args) {

//        LinkedList_XX list = new LinkedList_XX();
//        list.insertFirst(15);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(165);
//        list.insertFirst(25);
//        list.insert(11,2);
//        list.display();
//        System.out.println(list.delete(2));
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteFirst());

        LinkedList_XX list = new LinkedList_XX();
        for (int i = 4; i > 0; i--) {
            list.insertLast(i);
        }
//        list.display();
//        list.bubbleSort();
        list.display();

        list.reverse(list.head);
        list.display();


    }

}
