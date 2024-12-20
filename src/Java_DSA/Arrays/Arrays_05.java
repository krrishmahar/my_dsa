package Java_DSA.Arrays;
//See Class_13_Array for Reference.
//Objects are stored in Heap memory and heap object are not continuous but can be made continuous.
//Array is basically an Object that stores variable in particular Data-type.
//Multiple data-types cannot be stored in a single array.
//In C/C++, Array refers to block of memory that is stored continuously in RAM. It is just Continuous Memory Allocation.
//In Java, due to Absence of Pointer, allocation cannot be continuous i.e, Array object in java may not be continuous.
//It depends on JVM.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_05 {
    public static void main(String[] args) {


        int[] array;    // Declaration
        array = new int[]{1, 2, 3, 4, 5};   //Initialization

        int[] newArray = array;
        System.out.println(4%5);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        int max = list.getLast();
        System.out.println(max);

        System.out.println(2%3);

//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            if (i != array.length - 1)
//                System.out.print(array[i] + ", "); //printing the  elements
//            else {
//                System.out.print(array[i]);
//            }
//        }
//        System.out.print("]");


//        System.out.println("\n");
//        System.out.println(Arrays.toString(array));

//        Scanner sc = new Scanner(System.in);
//        ros = new int[]{12, 31, 22, 34, 100};
//        int[] ros;
        //declaration of ros array in stack memory. -> happens at compile time.
//        ros = new int[5];
        //initialization -> an actual object ros will store 5 integers in heap memory.

//  Initialization and  Memory Allocation of an object at run-time is called Dynamic memory allocation.
//        primitives are stored in stack memory
//        Objects like array, heap , map are stored in heap memory
//        Heap objects are not continuous
//        hence, array may not be continuous
//        Note: declaration of both are stored in stack memory but values are as followed as above

        //Assignment of Null type or (None type in Python) ->
        //Null is no Datatype BUT, a special literal.
//        int count = 0; boolean call = true //0 ,true, false is a literal
//        String [] str = {} ;
//        System.out.println(str[0]);// -> will give output <null> since no String is initiated/written.

// Allocation of Null is only applicable for Non-primitive Data-types-> String,Object,Class,Array,Interface and Enum.

//        Array input in loop ->
//        //1. Array of primitives.
//        for (int i = 0; i < ros.length ; i++) {
//            ros[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(ros)); //best way to print
//
//        for (int i : ros) { //For each element in array print the loop hence no need for i++;
//            System.out.print(i + " ");
//            ros.toString();
//        }

        //2.Array of Objects ->

//        String[] string = {"Krrish", "Liladhar", "Mahar"};
//        System.out.println(string[0]);
//        System.out.println(string[0].compareTo(string[2]));
//        System.out.println(Arrays.toString(string));//-> gives whole array.
//        System.out.println(String.valueOf(11));

        //Multidimensional Array ->
        //Internal working of multidimensional array
//=>By first creating an Array in heap, further creates multiple sub-arrays in stack memory  as an Index of main array.

//        int [][] example  ={
//                {1,2,3}, //-> 0th Index. i.e, 1st row containing (1,2,3) in 1st column
//                {11,5645,64,8},
//                {4,6},
//                {19},
//                {7,8,9}
//        };

//        int [][] arr = new int[3][3]; //->creates 3X3 array of 9 elements
////        System.out.println(arr.length);

        //.length method is inapplicable for [For each loop] hence below technique is used.

        //Input of an 2D array.........
//        for (int row = 0; row < arr.length; row++)
////      For each index of row it has respective index of column and initiates next for loop.
//        {
//            for (int column = 0; column <arr[row].length ; column++) {
//                arr[row][column] = sc.nextInt();
//
//            }
//        }

//      //Below method is used to give output of 2-D array by for each.
//        for (int row = 0; row < arr.length; row++)
////      For each index of row it has respective index of column and initiates next for loop.
//        {
//            for (int column = 0; column <arr[row].length ; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        Output 2
//        for (int row = 0;row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        System.out.println();
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
////                System.out.println(anInt + " ");
////      System.out.println(Arrays.toString(arr));//gives an error due to not being specific about inner elements.
//                System.out.println(Arrays.toString(arr[anInt]));
//            }
//            System.out.println();
//        }

//        for (int[] a:arr){
//            System.out.println(Arrays.toString(a));
//        }

//        Jagged Array: Fucking same 2-D array but with unknown no. of columns i.e, Dynamic 2D array

//        int[][] array = {
//                {1, 0, 0},
//                {0, 1, 0, 0, 0, 1},
//                {0, 0, 1, 1, 1}
//        };
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] ints : array) {
//            System.out.println(Arrays.toString(ints));
//
//        }


        //ArrayList -> Used when in-definite indexes in the array.
        //See Class_46_AdvancedJava for Reference.

//      ArrayList from Collection framework with initial capacity of 10.
//     <Rapper Class> , like Integer,String,Float,etc. and Not DATA-TYPES.
//      Internal working of ArrayList -> click CTRl+ArrayList to see code.
//


//        ArrayList <Integer> list = new ArrayList<>(2);
//        ArrayList <Datatype/ null> list = new ArrayList<>(2);
////        If added object is greater than initialCapacity then,
//        list.add(12);
//        list.add(644);
//        list.add(41);
//        list.add(11,0);
//
//
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(list.get(i));//pass index, list[index] throws an Error.
//        }

//        //Multi-dimensional ArrayList.
//        ArrayList<ArrayList> arrList = new ArrayList<>();
//
//
//        for (int i = 0; i < 3; i++)//Initialization
//        {//can add 2 elements
//            arrList.add(new ArrayList<>());// Adding Elements
//        }
//
//        for (int i = 0; i <3 ; i++)
//            {
//            for (int j = 0; j <3 ; j++) {
//                arrList.get(i).add(sc.nextInt());
//            }
//        }
//// Output. Initialization is needed since without previous code, program won't work.
//        System.out.println(arrList);

        int ans = isPrime(5,5/2);
//        System.out.println(ans);
//        System.out.println(fibo(10));
    }

    static int isPrime(int x, int i){
        if (x%i <= 1){
            return 0;
        } else if (i==1) {
            return 1;
        }
        return isPrime(x,i-1);
    }

    static int fibo(int x){
        if (x<=1){
            return 0;
        }
        return (x-2)+(x-1);
    }


}


