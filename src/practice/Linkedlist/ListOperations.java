package practice.Linkedlist;

public interface ListOperations<T> {
    void add(T value);
    void reverse();
    void display();
    void addAll(ListOperations< ? extends T > otherList);
}
