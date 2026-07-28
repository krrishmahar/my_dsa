package Java_DSA.Heaps;

import java.util.ArrayList;

public class Main {
    static void main() throws Exception {
        BaseHeap<Integer> heap1 = new BaseHeap<>();
        heap1.insert(35);
        heap1.insert(45);
        heap1.insert(25);
        heap1.insert(60);
        System.out.println(heap1.remove());

        ArrayList<Integer> list = heap1.heapsort();
        System.out.println(list);
    }
}
