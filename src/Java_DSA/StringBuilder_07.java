package Java_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class StringBuilder_07 {

    // What is String Pool?
//Ans: String Pool is a Separate Memory structure inside the Heap, in which String Immutability is applied.

    // What is String Immutability?
//Ans: An Ability of String datatype to not change an assigned variable for Security reasons.
    //E.g. - if multiple people having same name inputs their data, then it won't be stored at a single String pool.
    //String name = "Krrish";
    //String name = "Krrish Mahar"; //gives error due to immutability.


//    Internal Working of String :
//    String   name = "Krrish";
//   Datatype reference variable = (assign to) "Object";
    //A reference variable from stack memory creates an Object in Heap Memory.

    //Case 1 : A single object is reassigned.
//    String str = "Krrish"; // ignored during execution
//   str = "Krrish Mahar";
//    System.out.println(str);

    //In this case, variable str is assigned to two object and initiated by last assignment making first one redundant.
//When executing the code, redundant variables are cleared by Garbage Collector in java, saving from hassle to relocate it.

    //Case 2 : Multiple variable are assigned to single object.
//    String str1 = "Krrish";
//    String str2 = "Krrish";
    //So, by optimization of Java, both assigned to same object.


    public static void main(String[] args) {

        //Comparison of Strings.

//        1. == method
        //Comparator(==) checks if both variables are pointing to same object.
        //This is due to Optimization of class String to not create more objects, if sme one is already present.
        //Thus reducing memory consumption and utilize more CPU.
        String str1 = "Krrish";
        String str2 = "Krrish";
//        System.out.println(str1 == str2);

        //but if 'new' keyword is used to assign them then,
        str1 = new String("Krrish");
        str2 = new String("Krrish");

        //This is explicit increase of memory by the coder.
//            System.out.println(str1== str2);//checks if both variable are assigned to same object, gives False.
//            System.out.println(str1.equals(str2));// .equals() meth checks the value of the object, gives True.

        //Output -> PrintStream Class:-
        //See OOP file for detailed explanation.
//            System.out.println();
//            System.out.println(11);
//            System.out.println(11.0f);
//            System.out.println("Krrish");
//            System.out.println(new int[]{1, 2, 3, 4, 5});// gives error
//            System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));//uses .toString() meth from Arrays.
//            System.out.println('K');
        //As shown above, multiple data-types can be initialized by println class is dur to overriding of println class.

        //Pretty Printing : used in Compete programming.

        float a = 11.01921f;
//            System.out.printf("Formatted Number is %.2f\n",a);//printf() meth uses placeholder( % ) and
//            System.out.printf("Pie : %.5f\n",Math.PI);
            /* There are many format specifiers we can use. Here are some common ones:

                %c - Character
                %d - Decimal number (base 10)
                %e - Exponential floating-point number
                %f - Floating-point number
                %i - Integer (base 10)
                %o - Octal number (base 8)
                %s - String
                %u - Unsigned decimal (integer) number
                %x - Hexadecimal number (base 16)
                %t - Date/time
                %n - Newlin*/

        //String Concatenation operator :-
        //Only (+) operator is pre-overloaded with int,float,String,etc.

        //These all calls from println does not store and are removed by Garbage Collector after execution.
//            System.out.println('a' + 'b');//converts char to ASCII value and concatenate/add.
//            System.out.println("a" + "b");//made chain of two char into string.
//            System.out.println('a' + "b");//give string ab
//            System.out.println('a' + 11);//gives 108
//            System.out.println((char)('a' + 11));// typecast 108 into letter 'l'.
//            System.out.println("a" + 19);//converts int to Integer(Rapport class) and concatenate in to.String() class.

//            System.out.println("Krrish" + new ArrayList<>());//simple concatenation of String and Array in to.String().
//            System.out.println("Krrish" + new Integer(11));//concatenation of String and Object.

//            System.out.println(new Integer(11) + new ArrayList<>());//gives error.
//            System.out.println(new Integer(11) + "" + new ArrayList<>());//gives no error. ->Entirely String type.
        //Operator(+) can import mainly a String object in to.String().
        //Hence, there should be least one String Object inbetween Complex Classes.

//Java doesn't support overloading of operators(+, -, *, /).
        //But C++ and Python supports it but, it results in Poor Code.

        //Performance();//see function's code.
        //Thus, can be better with Complexity of O(n) by Reference-type object -> StringBuilder
        StringBuilder builder = new StringBuilder();//doesn't create new object but change value in it.
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
//        System.out.println(builder);
        builder.deleteCharAt(5);
//        System.out.println(builder);
        builder.reverse();
//        System.out.println(builder);

        //String Method :
        String name = "Karrish Liladhar Mahar";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase());//creates new object due to string immutability.
//        System.out.println("      Krrish      ".strip());//.strip() removes all whitespace
//System.out.println(Arrays.toString(name.split(" ")));//.split() meth will cut till the regex and add them at array.

//        System.out.println(Arrays.toString(name.toLowerCase().split("a")));

        //Question : Check if a String is Palindrome or Not.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(isPalindrome(str));


    }

    static boolean isPalindrome(String str) {

        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    static void Performance() {
        //Working : In loop, char 'a' forms and add with char 'b' creating new array and so on.
        // Like : a ->ab ->abc ->abcd -> so on.... ->abcdefghijklmnopqrstuvwxyz. And last string is print.
        //But its, formula used in it is n(n+1)/2 ->> ultimately n^2.
        //Thus, Inefficient AF and immutable, due to space complexity is O(n^2)

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;//series = series + ch;
//            System.out.println(ch);
        }
        System.out.println(series);

    }

}
