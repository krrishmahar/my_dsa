package Java_DSA.Stacks_implementation;

public class QueueMain {

    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(151);
//        queue.insert(1551);
//        queue.insert(11);
//        queue.insert(21);
//        queue.insert(15);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(151);
        queue.insert(11);
        queue.insert(21);
        queue.insert(15);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(101);
        queue.display();

    }


}
