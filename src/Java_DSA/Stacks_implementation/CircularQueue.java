package Java_DSA.Stacks_implementation;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; //ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0; //ptr is at last index
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item; //first assign end = item then end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++]; //for e.g: at pass1: removed == data[0]/data[front] and increment front
        front = front % data.length;// 1 == 0%size(5) = 0 i.e, 1st index will be front
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        int i = front;
        if (isEmpty()) {
            System.out.println("EmptyStackException");
        }
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;//this will help to convert 6,7,8,9,10 and son on index into 1,2,3,4,0
        } while (i != end);
        System.out.println("END");
    }


}
