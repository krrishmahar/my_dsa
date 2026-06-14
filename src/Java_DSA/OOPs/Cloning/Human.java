package Java_DSA.OOPs.Cloning;

import java.util.Arrays;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age, String name, int[] arr) {
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5, 6};
    }

    public String toString() {
        if (this.arr == null)   return "Array not initialized\n this.arr =" + Arrays.toString(this.arr);
        return Arrays.toString(this.arr);
    }

    //Instead of using Clonable it is better to use Copy Constructor
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("This is deep copy");
        //It is shallow due to it copying memory address of this parent so if it is changes, this will change too
        Human twin = (Human) super.clone(); // this is actually shallow copy

        //make a deep copy
        //But deep copy will be slower due to manual loop instead, use
        // Native array copying is heavily optimized by the JVM.
//        twin.arr = new int[twin.arr.length];
//        for (int i = 0; i < twin.arr.length; i++) {
//            twin.arr[i] = this.arr[i];
//        }

//        twin.arr = new int[this.arr.length];
//        twin.arr = this.arr.clone()

        // Crucial Step: Break the reference link by allocating a NEW memory block!
        twin.arr = new int[this.arr.length];
        System.arraycopy(this.arr, 0, twin.arr, 0, this.arr.length);

        return twin;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        System.out.println("This is Shallow copy");
//        return super.clone();
//    }


}
