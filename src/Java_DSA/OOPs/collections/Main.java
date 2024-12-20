package Java_DSA.OOPs.collections;

import java.util.*;

public class Main implements Cloneable {


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("This is Shallow copy");
        return super.clone();
    }


    //See this img: https://prod-acb5.kxcdn.com/wp-content/uploads/2021/07/Collection-in-Java.png

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new Vector<>();
        //Vectors are single threaded such that they are slower than ArrayList


        int[] arr1 = new int[6];    //Static array declaration
        int[] arr2 = new int[]{5, 41, 5, 12, 21, 21};    // Dynamic array declaration with initialization
        for (int i = 0; i < arr1.length; i++) {     //initialization of static array via deep-copy
            arr1[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr1));  //printing aar1
        System.out.println(Arrays.toString(arr2));  //printing aar2

        ArrayList<Integer> list = new ArrayList<>();
        // By default, ArrayList has initial capacity of 10 values only But....
        for (int i = 1; i <= 40; i++) {
            list.add(i);
        }
        System.out.println(list);


//        System.out.println("----------------------------");
//        arr1[0] = 11;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr1));
//
//        list2.add(54);
//        list2.add(5);
//        list2.add(4);
//        System.out.println(list2);
    }

}
