package Java_DSA.OOPs.generics;

//https://docs.oracle.com/javase/tutorial/java/generics/index.html

// Generics are used code re-usability purpose.
// Previously, made CustomArrayList is only viable for int primitive. To avoid writing code for string, object arraylist
// We use generics to make template of code base without using any primitives
// This also helps to implement typecheck at compile time. e.g
// ArrayList<Integer> list = new ArrayList<>();
// list.add(11.52f) -> to restrict bullshit like this


public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current item in temp
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public void removeAll() {
        while (!isEmpty()) {
            remove();
        }
        System.out.println("All items are successfully removed");
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;

    }

    public int getSize() {
        return size;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(112);
//          list.add('1');// gives error
        list.add(19);
        System.out.println(list);
        list.removeAll();
        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

}
