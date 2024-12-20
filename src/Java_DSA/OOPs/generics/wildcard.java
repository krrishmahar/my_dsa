package Java_DSA.OOPs.generics;

import java.util.List;

public class wildcard<T extends Number> {
//Using Java wildcard:  <T extends Number>
    //with this we can add classes which are Number or subclasses of number not, Strings, Char -> more type-checking
//  doc: https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html
//  wildcards are basically used to restrict

//    Generics provide type checks at compile time, and the produced bytecode only knows classes, methods and interfaces.
//    Bytecode is executed at runtime and objects are created at runtime as well,
//    Looking at bytecode, it doesn't contain the "type" of object we want to create, so it shows error.

    public void getList(List<? extends Number> list) {

        //<Number> can only pass Numbers as parameter
        //<? extends Number> can pass even subclasses of number
    }

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public wildcard() {
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

    }

}
