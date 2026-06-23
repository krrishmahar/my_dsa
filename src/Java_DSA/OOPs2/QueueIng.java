package Java_DSA.OOPs2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueIng {
    //offer(), -> O(1) but can be O(n) due to capacity
    //poll(), peek() -> O(1)
    static void main() {
        Queue<Integer> queue=  new LinkedList<>();
        queue.offer(4);
        queue.offer(8);
        queue.offer(12);
        queue.offer(16);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
