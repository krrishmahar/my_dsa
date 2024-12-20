package ques.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class factors {

    public static void main(String[] args) {
//        factor1(20);
//        factor2(20);
        factor3(20);
    }

    static void factor1(int n) { // complexity = O(n)
        for (int factors = 1; factors < n; factors++) {
            if (n % factors == 0) {
                System.out.printf("%d is a factor of %d\n", factors, n);
            }
        }
    }


    static void factor2(int n) { // time Complexity = O(sqrt(n)) and space complexity = O(1)
        for (int i = 1; i*i < n; i++) {
            //By limiting it to its sqrt, prevents repeating numbers
            //But the answer might be unsorted and like, 1, 20, 2, 10, 4,5
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
        System.out.println();
    }

    static void factor3(int n) {
        //Sorted but also stores numbers in auxiliary space, increase space complexity
        ArrayList<Integer> space = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    space.add((n / i));
                }
            }
        }
        //Above loop, storing and print numbers till sqrt(n), while also storing term multiplied term to list space
        //Below

//        space.sort((o1, o2) -> ((Integer) o1).compareTo((Integer) o2));

//        Object[] string = space.stream().sorted().toArray();
//        System.out.println(Arrays.toString(string));

        for (int i = space.size() - 1; i >= 0; i--) {
            System.out.print(space.get(i) + " ");
        }
    }

}
