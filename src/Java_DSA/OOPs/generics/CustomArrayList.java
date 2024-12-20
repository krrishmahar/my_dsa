package Java_DSA.OOPs.generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

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

    public int remove() {
        int removed = data[--size];
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

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
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
        CustomArrayList list = new CustomArrayList();
        list.add(112);
        list.add(11);
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
