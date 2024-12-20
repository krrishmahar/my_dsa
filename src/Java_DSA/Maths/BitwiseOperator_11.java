package Java_DSA.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class BitwiseOperator_11 {



//    Arithmetic Operators -> +, -, *, /,%

//    Unary Operators ->
//    minus(-),
//    Not Operator(!)
//    Increment/pre-increment (a++/++a)
//    Decrement/pre decrement (a--/--a)

//    Assignment Operator -> =, +=, -=, *=, /=, %=

//    Relational Operator -> ==, !=, <, >, <=, >=

//    Logical Operator -> &&, ||, !a, true, false

//    Ternary Operator -> similar to if-else concept.
//      variable = Antecedent ? Consequence1: Consequence2;
//      -> int res = (n1>n2) ? (n1+n2) : (n1 - n2);
//      -> String result = (condition) ? "True" : "False";

//    Bitwise Operator -> 1 = true; 0 = false;
//    --- ALl bitwise operator are Associative in nature.
//    1. AND Operator -> &&
//    2. OR Operator  -> ||

//    3. XOR Operator -> ^ ->Exclusive OR ->
//    -> Same as if and only if(<-->) logic, if same ->0 if different ->1
//    if there are two No. , then only one should be true then true.
//    If more than two then, odd No. is true.
//    a^0 = a; a^1 = ~a; a^a = 0;

//    Compliment Operator -> ~ -> int a = 10110; then, ~a = 01001;

//    Shifts Operator ->
//    (10 )10 -> (1010)2

//    1. Left shift Operator ->( << )
//    ->( a<<b == a*(2^b) )
//    10<<1 then (10)10== (1010)2 = (10100)2 : whole decimal converts into binary then left shifts by 0
//    2. Right shift Operator -> ( >> )
//    ->( a>>b == a/(2^b) )
//    10110 >> 1 -> 1011 -> i.e, ignore last left term


    static boolean getbits(int num, int i){
        return ((num & (1 << i)) !=0);
    }

    static int setbits(int num, int i){
        return num | (i << 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(getbits(16,4));
        System.out.println(setbits(64,11));
        //No need to write program that converts decimal into binary since compiler only takes binary,
//        JVM already converts it into bits then run in compiler.

//        Number System ->
//        all number system-> 0000123584 == 123584 (leading zaeos are ignored)
//          ->1. Decimal     ->0,1,2,3,4,5,6,7,8,9 -> Base = 10
//          ->2. Binary      ->0, 1  -> Base : 2 -> int a =10; then, 10 stores in 1010 in memory.
//          ->3. Octal       ->0,1,2,3,4,5,6,7  ->Base : 8
//          ->4. Hexadecimal ->0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f -> Base : 16

//        Number System Conversion Rules:
//        let (num)base2 = (num)2

//        1. From Decimal to Base b
//        -> Keep dividing by Base(b), take remainder, write in opposite
//      -> (11)10 ->11/2 (1) =5/2 (1) =2/2 =(0) =1 (0) then,
//        -> (11)10 = (0011)2
//        -> (292)10 = (00100100)2

//        2. From Any Base b to Decimal :
//        ->multiply from RHS and add power of base to digits.
//        (0011)2 -> (2^0)*1 + (2^1)*1 + (2^2)*0 + (2^3)*0 -> (11)10
//        (23)8   -> (8^0)*3 + (8^1)*2 -> 3+16 = (19)10

//        Use these two rules to convert any system to another.
//        SEE NOTES FOR FURTHER REFERENCE AND QUESTIONS.

//        int ques1 = sc.nextInt();
//        boolean ans1 = isOdd(ques1);
//        System.out.println(ans1);

            int[] ques2 = {2, 3, 6, 4, 4, 2, 3};
//        System.out.println(Ans2(ques2));

        int[] ques3 = {-3 - 2, 2, 1, 5, -5, 3};
//        System.out.println(Ans3(ques3));

//        System.out.println(Ans4(10));

//        Question 9 -> Amazon
//        int n = 6;
//        int ans9 =0;
//        int base = 5;
////        System.out.println(n&1);//this will only do (last bit & 1), not the whole byte.
//        while (n>0){
//            int last = n&1;
//            n = n>>1;//will shift digits by 1; (6)10 = (110)
//            ans9 += last * base;
//            base *= 5;
//        }
//        System.out.println(ans9);

        //Question 10
//        int n = 29211;
        int b = 10;
//        space complexity = O(log(n))

//        int ans10 = (int) (Math.log(n) / Math.log(b) + 1);//typecasting a rapport class into int and counts total digit
//        ans10 = log(29211) / log(10) +1
//        System.out.println(ans10);

//    double ans11 = Ans11(3);
////    boolean Ans11 = (1<<(n-1)) == 1*Math.pow(2,n-1);
////        System.out.println(Ans11);
////        System.out.println(ans11);
//
//        int k = 4;
//        boolean ans12 = (k & (k-1)) ==0;//Note : if k=0; it is an exception and returns true.
////        System.out.println(ans12);
//
//        //Question 13
//        //Normally, a raise to b have complexity O(b), i.e, a is multiplied b times.
////        but by using Math.pow(a,b), time complexity will be O(log b)
////      Instead of using Math library, we'll code this
//        int base = 3;
//        int power = 6;
//        int ans13 = 1;
//
//        while (power>0) {
//            //since, power is already compiled in binary, (6)10 = (110)2
//            if ((power & 1) == 1) {// last digit of power(0) & 1 ==1 then,
//                ans13 *= base;
//            } //then, base = 1*3=3 then power right shifts by 1
//            //it will be 2nd digit of power(1) & 1 ==1 then, ans13 = 3*3 = 9;
//            //then, base = 9*9=81 then power right shifts by 1
//            //it will be 3rd digit of power(1) & 1 ==1 then, ans13 = 9 * 81;
//            // loop breaks; having ans13 = 179
//                base *= base;
//                power = power >> 1;
//
//        }
//        System.out.println(ans13);

        //QUESTION 14 :
//        METHOD 2 -
        int n1 = 256;
//        System.out.println(Integer.toBinaryString(n1));//Integer.toBinaryString(n1) shows binary representation of No.

//        System.out.println(setBits(n1));

        //Question 15 and 16 :
        int a = 3, b1 = 9;
        int ans16 = xor(b) - xor(a - 1);
//        System.out.println(ans16);

//Below method is just for checking  above ans, it gives Time Limit Exceed for large No.
        int ansCheck = 0;
        for (int i = 0; i <= b; i++) {
            ansCheck ^= i;
        }
//        System.out.println(ansCheck);

        //Question 17 (Google): https://leetcode.com/problems/flipping-an-image/
//        Flipping an image
/*        Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

        To flip an image horizontally means that each row of the image is reversed.

        For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        For example, inverting [0,1,1] results in [1,0,0].*/
sc.close();

    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            //reverse the array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
//swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;

    }

    public static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        //OR
     /*   while (n>0){
            count++;
            n = n & (n-1);
        }*/


        return count;
    }

    private static double Ans11(int n) {
        return 2 * (Math.pow(2, (n - 1)));

    }

    private static int Ans3(int[] ques3) {
        int k = 0;
        for (int l : ques3) {
            k += l;
        }
        return k;
    }

    private static int Ans4(int n) {
        int k = 0;
        while (n > 0) {
            n %= 2;
            k += n;
            //lastly k = (19)10 = (10011)2
        }
        return n & (1 << (n + 1));
    }

    private static boolean isOdd(int n) {

        return (n & 1) == 1;
    }

    private static int Ans2(int[] arr) {
        int Unique = 0;

        for (int n : arr) {
            Unique ^= n;

        }
        return Unique;
    }

}
