package Java_DSA.LinkedList;

public class Main extends LinkedList_XX {


    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);  //creation of new node.value at head
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        if (node == null) {
            // Handle index out of bounds, could throw an exception or perform other error handling
            return null;
        }

        node.next = insertRec(val, --index, node.next);   //taking the value with decrementing index and moving forward
        return node;
    }

    //      Remove Duplicates from Sorted List:
    public void Duplicate() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        tail = node;    //after being stopped at last node, we declare last node as tail
        tail.next = null;
    }

    //      Merge two sorted list:
//    @org.jetbrains.annotations.NotNull
    public static LinkedList_XX merge(LinkedList_XX first, LinkedList_XX second) {
        Node f = first.head;
        Node s = second.head;

        LinkedList_XX ans = new LinkedList_XX();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }

            while (f != null) {
                ans.insertLast(f.value);
                f = f.next;
            }
            while (s != null) {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Main list = new Main();
//        {   list.insertFirst(1);
//            list.insertFirst(1);
//            list.insertFirst(1);
//            list.insertFirst(6);
//            list.insertFirst(6);
//            list.insertFirst(9);
//        }
//        list.display();
//      Insert using recursion
//        list.insertRec(152,0);

//      Remove Duplicates from Sorted List:
//        https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//        list.Duplicate();
//        list.display();

//        Merge two sorted list:
//          https://leetcode.com/problems/merge-two-sorted-lists/
        LinkedList_XX list1 = new LinkedList_XX();
        LinkedList_XX list2 = new LinkedList_XX();
        {
            list1.insertLast(1);
            list1.insertLast(3);
            list1.insertLast(5);

            list2.insertLast(1);
            list2.insertLast(2);
            list2.insertLast(9);
            list2.insertLast(14);
        }
        LinkedList_XX ans = Main.merge(list1, list2);
        ans.display();
    }
}
