package Java_DSA.Recursion;

public class Recursion_09_IMP {

    //What is Iteration?
// -> It is method of returning a code by loops instead of calling functions which gives More Optimised Program.
//  Usually more complex and hard than recursion.

    // Internal Working  of Functional Call :
/*-> Any Function that is currently running stores in Stack Memory. In case of Multiple function call, all functions
 ->  stores in Stack till, end function is executed. This results in less CPU utilization and process starving.
 ->  When all functions are executed, it is removed fom Stack and returned to where it was called.*/

    //Recursion is important topic for almost all programs, linkld, dynamic Programing and many more.
    //Space Complexity -> O(n) -> not constant due to recursive calls.
    //Base Condition for Recursion is a function where recursion stop making new call.
    //And In any case, it takes a separate memory for every call.
    //Hence, with No base condition memory will exceed the limit and gives StackOverflow Error.


/*     Use of Recursion?
Ans : 1. Helps in solving Bigger and complex problems.
      2. You can Convert Iteration into Recursion and Vice versa.
      3. Breakdown Bigger problems into Smaller problems.
*/

    //  Recursion Tree -> V.IMP
//Ans : main function calling other function in linear manner in flow of program
//      and after execution of end function, flow of programs going to main function again.

    public static void main(String[] args) {

//        message();// This is known as Call stack by recursion since it calls other function on its call.

//        print1(1);
        System.out.println(Fibonacci(5));


        //Tail Recursion -> Last function recursive call of Recursive function.
        //In message, tail recursion is message5

        //To determine if problem is Recursive or Not?
//Ans : 1. Identify if problem can be broken into smaller problem.
//      2. Write the recursive function(if needed)
//      3. Draw the Recursive tree.
//      4.
//      5. See the Output value of each step.

        //Note :
//        1.See flow of function & how they are getting in stack.
//        2.Identify both left and right tree calls.
//        {System first completes the 1st called tree(left tree) then next one(right tree) }
//        3.Draw the tree on pen & paper repeatedly then, use the debugger.
//        4.DO NOT OVERTHINK.

        //Keypoint : Note variable used in Arguments, return type and Body of program.

        //Types of Recursive Tree :
    /*  1. Linear Recursive Tree -> Fibonacci Series.
        2. Divide and Conquer Recursive Tree -> Binary Tree

        //IMP Note : Linear recursive tree is critically inefficient as
//     Fibonacci series give space and time complexities of O(1.618^n) i.e, golden ratio raise to n, not 2^n.
//     Fibonacci series using recursion call same function multiple times
//      Hence, Recursion with Dynamic Programming is very useful and essential.

*/

    }


    //Binary Search with Recursion.
    static int Search(int[] arr, int target, int s, int e) {
        //See the notebook for this reference and try to olve it again.

        s = 0;
        e = arr.length - 1;

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] < arr[target]) {
            Search(arr, target, mid + 1, e);
        }
        if (arr[mid] > arr[target]) {
            Search(arr, target, s, mid - 1);
        }

        return mid;//for target == arr[mid]
    }


    //E.g - To write Hello World 5 times.

    //    *. Infinite Recursion
    static void print1(int n) {
        if (n > 5) {//Cond to exit loop
            return;
        }
        System.out.println(n);
        print1(n + 1);//Calling itself and ends up inInfinite Loop
    }


    //    *. normal Recursion
    static void message() {
        System.out.println("Hello World");
        message2();
    }

    static void message2() {
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
        message5();
    }

    static void message5() {
        System.out.println("Hello World");

    }

    static int Fibonacci(int num) {

        if (num < 2) {
            return num;
        }

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}
