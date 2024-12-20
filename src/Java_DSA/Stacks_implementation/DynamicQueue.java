package Java_DSA.Stacks_implementation;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
//            double the array size
            int[] temp = new int[data.length * 2];

//  copy previous item in temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
//    at this point, we know that array is yet to be full so, we'll add item as usual
        return super.insert(item);
    }


}
