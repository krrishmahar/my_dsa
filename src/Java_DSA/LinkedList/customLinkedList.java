package Java_DSA.LinkedList;

class LinkedListie {
    private Node head;
    private Node tail;
    protected int SIZE;

    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public LinkedListie() {
        this.SIZE = 0;
    }

    public LinkedListie(Node head ) {
        this.head = head;
        Node node = new Node(head.val);

    }
    public void prepend(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
    SIZE++;
    }

    public void extend(int val){

        if (tail == null){
            prepend(val);
            SIZE++;
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        SIZE++;

//        if (head == null) {
//            head = tail;
//            SIZE++;
//        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
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


        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            }

        Node node = new Node(val);
        node.next = temp.next;
        SIZE++;

    }
}


public class customLinkedList {

    public static void main(String[] args) {
        LinkedListie list = new LinkedListie();
        list.prepend(19);
        list.extend(11);
//        list.display();
        list.insert(0,101);
        list.insert(2,101);
        list.display();


        System.out.println();
        System.out.println(list.SIZE);

    }


}
