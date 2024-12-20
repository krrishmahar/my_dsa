package Java_DSA.Tree.AlgoImplement;

public class BFS {
    private class customQueue {
        //creating a custom queue
         int[] queue;
         static final int SIZE = 10;
         int end = 0;

         public boolean isEmpty(){ return end == 0;}
         public boolean isFull(){ return end == SIZE;}

        public customQueue() {
            queue = new int[SIZE];
        }

        public boolean enqueue(int i){
             if (!isFull()){
                 queue[end++] = i;
                 return true;
             }
             return false;
        }

        public int dequeue(){
             if (isEmpty()){
                 System.err.println("Queue is Empty");
                 return Integer.MIN_VALUE;
             }
             int removed = queue[0];
             for (int i = 1; i < end; i++) {
                queue[i - 1] = queue[i];
            }
             end--;
             return removed;
        }

        public void display() {
            for (int i = 0; i < end; i++) {
                System.out.print(queue[i] + " <- ");
            }
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(); // Create an instance of BFS to access inner class
        customQueue queue = bfs.new customQueue(); // Create a customQueue instance

        // Enqueue elements
        for (int i = 5; i < 10; i++) {
            queue.enqueue(i);
        }

        queue.display(); // Display the queue

        // Dequeue elements and display the queue after each dequeue
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
