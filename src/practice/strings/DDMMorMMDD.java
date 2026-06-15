package practice.strings;

import java.util.Scanner;

//https://www.codechef.com/practice/course/strings/STRINGS/problems/DDMMORMMDD
//Time -> O(T) T-> test cases
//Spcae -> O(1)
public class DDMMorMMDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
//            String[] parts = s.split("/"); //s.split will be constant O(3) for all
//            //space will also be O(3) because it stores 3 values
//            int firstHalf = Integer.parseInt(parts[0]);
//            int secondHalf = Integer.parseInt(parts[1]);

            //Optimization -> Space will be O(1) from O(3)
            int firstSlash = s.indexOf('/');
            int secondSlash = s.indexOf('/', firstSlash + 1);
            int firstHalf = Integer.parseInt(s.substring(0, firstSlash));
            int secondHalf = Integer.parseInt(s.substring(firstSlash + 1, secondSlash));

            checkGregorian(firstHalf, secondHalf);
        }
        scanner.close();
    }

    static void checkGregorian(int X, int Y){
        if (X <=12 && Y > 12){
            System.out.println("MM/DD/YYYY");
        } else if (X > 12 && Y <=12){
            System.out.println("DD/MM/YYYY");
        } else {
            System.out.println("BOTH");
        }
    }
}
