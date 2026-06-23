package Java_DSA.OOPs2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIng {
    static void main() {
        List<Integer> list = new LinkedList<>();
        //Linkedlist internally uses doubly linkedlist
        //can acts as both List and Queue, it implements both List and Queue interface
        //better for manipulating data
        //not continuous memory allocation
        //beter for deletion ops, generally slower
        list.add(2);list.add(4);list.add(6);list.add(8);
        list.add(10);
        list.addFirst(0); list.addLast(100);
        System.out.println(list);
        list.set(list.size()-1, 99);
        System.out.println(list);

    }
}
