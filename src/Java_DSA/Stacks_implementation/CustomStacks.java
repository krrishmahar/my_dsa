package Java_DSA.Stacks_implementation;


public class CustomStacks {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
//    private: since no other can change it
//    static: applicable to all meth of custom class
//    final: won't change even after reinitialized by mistake

    int ptr = -1;

    public CustomStacks() {//when no size is given, goes with default size 10
        this(DEFAULT_SIZE); //this keyword is called as constructor
    }

    public CustomStacks(int size) {
        this.data = new int[size]; //this keyword is used to reference the object(data)
        // and make new data array of size[size]
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack overflowed");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StacksException {
        if (isEmpty()) {
            throw new StacksException("Stack underflow-ed");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peekTop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek while Stack is  underflow-ed");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; //ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1; //ptr is at last index
    }

    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(15);
//        stack.push(125);
//        stack.push(151);
//        stack.push(5);
//        stack.push(315);
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(151);
//        queue.add(51);
//        queue.add(1);
//        queue.add(41);
//        queue.add(156);
//        System.out.println(queue.remove());

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(89);
//        deque.add(89);
//        deque.addLast(465);
//        deque.add(89);
//        deque.removeFirst();
//        deque.removeFirstOccurrence(89);


    }


}
