package assignment;

import java.util.Scanner;

interface greeting {
    void greet(String name);
}

public class first_java_02 {

    static Scanner sc = new Scanner(System.in);

    private static void evenOdd() {
        System.out.println("Enter the Number");

        double num = sc.nextDouble();

        String ans = (num % 2 == 0) ? "It is an even number." : (num % 2 == 1) ? "It is an odd number." : "Invalid input.";
        System.out.println(ans);
    }

    private static void greet(String name, greeting obj) {
        obj.greet(name);
    }

    public static void main(String[] args) {
        evenOdd();
        first_java_02 obj = new first_java_02();
        greeting greet = (name) -> System.out.printf("Hello! Good Morning ", name);


        //        int num = sc.nextInt();


    }

}
