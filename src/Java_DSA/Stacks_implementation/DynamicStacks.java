package Java_DSA.Stacks_implementation;

public class DynamicStacks extends CustomStacks {

    public DynamicStacks() {
        super();//it will call CustomStacks
    }

    public DynamicStacks(int size) {
        super(size);//it will call CustomStacks(size)
    }

    @Override
    public boolean push(int item) {
//        this takes care of stack when it is full
        if (this.isFull()) {
//            double the array size
            int[] temp = new int[data.length * 2];

//            copy previous item in temp
//            for (int i= 0; i < data.length; i++){
//                temp[i] = data[i];
//            }
//            or
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
//    at this point, we know that array is yet to be full so, we'll add item as usual
        return super.push(item);
    }

    public static void main(String[] args) {
        /*CustomStacks stack1 = new CustomStacks(3);
        stack1.push(15);
        stack1.push(15);
        stack1.push(15);
        stack1.push(15);// will give stack overflow

        DynamicStacks stack2 = new DynamicStacks(2);
        stack2.push(15);
        stack2.push(15);
        stack2.push(15);//will work
        stack2.push(15);
        stack2.push(15);
        stack2.push(15);*/


    }

}
