package practice.Linkedlist;
import java.util.Objects;

//abstraction layer
abstract class AbstractLinkedList<T> implements ListOperations<T> {
    protected int size = 0;
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}

public class GenericLinkedList<T> extends AbstractLinkedList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
        public int getIdentityHash() {
            return System.identityHashCode(this);
        }
    }

    Node<T> head;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null)   head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public void reverse() {
        if (size < 2)   return;
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }
        head = prev;
    }

    @Override
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addAll(ListOperations< ? extends T> otherList) {
        if (otherList instanceof GenericLinkedList<? extends T> concreteOther) {
            Node<? extends T> temp = concreteOther.head;
            while (temp != null) {
                this.add((T) temp.value);
                temp = temp.next;
            }
        }
    }

}