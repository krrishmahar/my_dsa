package practice.Linkedlist;
import practice.Linkedlist.GenericLinkedList.Node;

import java.util.Objects;

//Remove duplicate from sorted List
public class removeDuplicate {
    static void removeDuplicates(Node<Integer> head){
        if (head == null)   return;
        Node<Integer> node = head;
        while (node.next != null){
            if (Objects.equals(node.value, node.next.value)){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }

    static void main() {
        GenericLinkedList<Integer> listy = new GenericLinkedList<>();
        listy.add(1);
        listy.add(1);
        listy.add(6);
        listy.add(8);
        listy.add(8);

        System.out.print("Original list: ");
        listy.display(); // Output: 1 -> 1 -> 6 -> 8 -> 8 -> null

        System.out.println("Removing Duplicates...");
        removeDuplicates(listy.getHead()); // Modifies the list internally

        System.out.print("Result list: ");
        listy.display(); // Output: 1 -> 6 -> 8 -> null

    }
}
