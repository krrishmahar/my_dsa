package Java_DSA;

import java.util.Scanner;

//There are two kinds of types in the Java programming language:
// primitive types (§4.2) and reference types (Object).
//There is also a special null type, the type of the expression null (§3.10.8, §15.8.1), which has no name.
//
//        Because the null type has no name, it is impossible to declare a variable of the null type or to cast to the null type.
//
//        The null reference is the only possible value of an expression of null type.
//
//        The null reference can always be assigned or cast to any reference type

//Brute force solution : possibility with worst space and time complexity.
/*Trying to write code like println.
class objs{
    public void in(Scanner sc){
        System.out.println("Taking input");
        String input = sc.next();
        if (input=="123") {
            System.out.println("Finally working");
        }
        sc.close();

    }
    public objs(Scanner sc) {
        System.out.println("Hello World");

        int a = sc.nextInt();
        if (a==11) {
            System.out.println("Hola Darling Darling woo");
        }
    }
    public void printing(String x){

        System.out.println(x);
    }
}*/
public class Basics_02 {
//Here, public : main/core class that can be accessed from anywhere.

    public static void main(String[] args) {

//Here, public : class can be accessed from anywhere, even from different package.
//      static : helps to run function (main) without creating an object in it.
//      void   : class without return.
        //       System.out.println(args[11]);//-> will store value '11' at heap memory of args.
//For compiling in terminals ->
//   javac -d . Basics_02.java
//-> javac : compiling Java file
//-> -d : choosing directory to save file
//-> . : for current directory/folder   -> .. : For previous directory
//-> className.java

//        System.out.println("String / object");
        //->System : a class inherited from java.lang that gives output(out) from function print/println.
        //It is inherited by default and can be seen by clicking it and pressing Ctrl.

//        objs obj = new objs(sc);
//        obj.in(sc);
//        obj.printing("");
//        obj.printing("");

        //Debugging is used to observe and identify bug in a giant-ass code in stepwise manner.
//By clicking on No. side and using a red pointer, called debug pointer helps to run a specific class only.
//        System.out.println("Heeho bitxh");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("The no you chose is "+a);

        //Float is a bigger datatype from Int
        //float num ;
//        float num =1212.54f;
//    num = (int) (num*1212);//This explicitly convert float to int and .54 will not show.
//        System.out.println(num);

        //Java also gives ASCII value and unicode value giving hindi language too.
//int number = 'k';
//        int number2 = 'K';
//        System.out.println(number);
//        System.out.println(number2);
//
//        System.out.println(
//                "श्रीगुरु चरन सरोज रज, निज मनु मुकुरु सुधारि।\n" +
//                "बरनऊं रघुबर बिमल जसु, जो दायकु फल चारि।। ");

        //Using of Loops ->
//      for loop should be used for definite No. of times a loop is initiated.
//      while loop should be used indefinite No of uses/inputs.

        //Fibonacci Series ->
//        //Method 1 :
//        int n= sc.nextInt();

        int n = 11, a = 0, ans = 1;

        if (n < 2) {
            System.out.println("1");
        } else {
            for (int i = 2; i <= n; i++) {
                int temp = a + ans;
                a = ans;
                ans = temp;
                System.out.println(ans);
            }
        }


        //Method 2 :
//        while (c<=n)
//        {int temp=ans;
//        ans=ans+a;
//        a=temp;
//        c++;}
//
//        System.out.println(ans);

//Counting Number
//        int e = 23232323;
//        int count =0;
//
//        while (e>0){
//            int rem = e%10;
//            if (rem==2){
//                count++;
//            }
//            e = e/10;
//
//        }
//        System.out.println(count);

        //Reversing the Number ->
//        int num = 123456789;
//        int Ans=0;
//
//        while (num>0) {
//            //pseudocode -> rem = 9 , num =12345678 and Ans = 0+9 = 9
//            //then it repeats rem= 12345678 % 10 =8, num = 1234567 and Ans = 0+ 98 and so on.
//            int rem = num%10;
//            num /= 10;
//            Ans = Ans*10 +rem;
//            System.out.println(Ans);
//        }
//        System.out.println(Ans);


        //Calculator ->
        //Taking input from user till he/she press X
//    int Ans = 0;
//        while (true) {
//            System.out.println("Enter an Operator :");
//            char input = sc.next().trim().charAt(0);
//
//            if (input =='+'|| input =='-'|| input =='*'|| input =='/'|| input =='%')
//            {
//                System.out.println("Enter the Number");
//                int num1 =sc.nextInt();
//                int num2 =sc.nextInt();
//
//                if (input == '+') {
//                    Ans = num1+num2;
//                }if (input == '-') {
//                Ans = num1-num2;
//            }if (input == '*') {
//                Ans = num1*num2;
//            }if (input == '/') {
//                try {
//                    Ans = num1/num2;
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }if (input == '%') {
//                Ans = num1%num2;
//            }
//            }
//            //else if and else block should not be nested!!
//            else if (input == 'X' || input=='x')
//            {break;}
//            else {
//                System.out.println("Invalid Input!");
//            }
//            System.out.println(Ans);
//        }
    }
}

