package Java_DSA;

import java.util.Arrays;
import java.util.Scanner;

//class hero{
//    static void greet (){
//        System.out.println("hello");
//    }
//    void bow (){
//        System.out.println("bowing");
//    }
//    private void wish (){
//        System.out.println("wishing");
//    }
//}
public class Methods_Function_04 {

    //   static void change(int [] arc) {arc [0] = 11;}
    static int i = 11; //This will be shadowed at line 60. Higher block will be shadowed by lower block of main class.
// VariableArguments -> see reference of Class17_VarArgs.

//    static  void fun(int i) {
//        System.out.println(i);

//Method Overloading ->
    //->Illegal, since int a can be in previous method
//    static void fun(int a){}
//    static int fun(int i){
//        int a = 11;
//        return a;
//    }

    //    static void fun(String s) {
//         s ="Hello Sekai";
//        System.out.println(s);
//        System.out.println("hello");
//    }
    static void demo(int... v) {
        System.out.println(Arrays.toString(v));

    }

    static void demo(String... s) {
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
//hero hero = new hero();
//        hero.greet();//static method is like private method but can call another static class in main function.
//        hero.bow();
////        hero.wish(); -> private modifier can only be called in own class.
//
//        int[] arr = {1,32,3,4,5,6,7,8,9};
//    change(arr);
//        System.out.println(Arrays.toString(arr));


//        Technique -> Scoping
//        ->Scoping is limit of an argument that can be used only in a block or method(static,private,etc)

        //1. Block Scope->
//        int a=11;
////        int a =19; -> a argument cannot be re-initialized. but can be changed
//        a=19;
//        System.out.println(a);
//        System.out.println("See if int a can be changed in another block");
//        {
//         int b= 101;
//         a=25;
//            System.out.println(a);
//            System.out.println(b);
//        }
////    b=111; shows an Error.
////        System.out.println(b);
//        System.out.println(a);
//
////        2. Loop Scope->
//        for (int aa=0;aa<11;aa++) {
//            System.out.println("Hello World");
//            aa=19;{aa=25; int bb=54;}
//            bb=53;
//        }
//        //Art of Shadowing -> shadowing does not work on methods but they can be overloded.
//        System.out.println(i);// 11
//        int i;  //-> Declaring
//        i = 123;//-> Initializing
//        System.out.println(i); // 11
////        fun(i);

        //Method Overloading

//        demo(12,35,31,13,13);
//        demo("krrish","Liladhar","Aniram","Mahar");
////      demo(13,"krrih"); -> both different data types cannot be used at same time
////        demo();-> Result in Ambuigity/inexactness to  decide a data type (int or String)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to verify it as an Armstrong Number");
        System.out.println(isArmstrong(sc.nextInt()));

        //All Armstrong numbers till 1000. There are only 5 number from 0 to 1000..
        for (int i = 0; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    //Question  1 ->
//Armstrong Number -> is a number in which sum of cube of individual digit is equal to the Number.e.g, 153 -> 1+125+27 =153
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;//or n /= 10;
            sum = sum + remainder * remainder * remainder;// sum += Math.paw(remainder,3);
        }
        return sum == original;

    }

}

