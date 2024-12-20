package Java_DSA;

import java.util.Arrays;

public class Space_Time_10 {

    //You must see notebook for detailed explanation.

    //Brute force soln : Solution that are not optimised but is efficient.

    //What is Time complexity?
//Ans : It is relation(slope) between size and time taken by program to execute.

    //What is Space Complexity?
//Ans : It is Required input space and Auxiliary space.
    //Space Complexity = Input space + Auxiliary space.
//But input space is ignored since it is a must and requirement of system.

    //In Binary Search, space complexity is O(1) i.e, constant since it doesn't create new array.

    //IMP Rules :
    /*
     1. Always look for Worst complexity by Brute Force Solution.
     2. Always look at complexities of larger data.
     3. Ignore the constants.
     4. Ignore the less dominating terms.
    */


    public static void main(String[] args) {

        //Find complexities of all below Questions.
        //Question 1.
        int[] arr1 = {8, 7, 6, 4, 3, 2, 1};
        ques1(arr1);
//        System.out.println(Arrays.toString(arr1));

        //Recursive Algorithm
        //See Notes on Akra Bazzi Theorem-------

        //Using Soln1 for Homogeneous recurrence eqns like fibonacci No.
        double ans1 = fiboFormula(45);
//        System.out.println(ans1);


    }

    static void ques1(int[] arr) {
        int n = arr.length - 1;
        int k = 1;
        for (int i = 0; i <= n; ) {//whole loop runs O((n - 1)/k)
            for (int j = 1; j <= k; j++) {//this loop is practically useless and doesn't affect the meth/
                bubbleSort(arr);//bubble sort will also run k time = O(k*n^2)
            }
            i += k;
            //Analysis of ques1 :
            //Here, outer loop runs till n times and inner loop runs k times and bubble sort having worst complexity O(n^2)
            //but k runs x times(unknown), so total runs will be 1 + xk <= n;
            //xk <= n - 1;
            //x = (n - 1)/k;

            //By following IMP RULES
            //Total time complexity : O( k*n^2 * (n-1)/k ) = n^2 * (n-1)
            // = n^2 * n
            // = O(n^3)

            //Whereas space complexity is constant as bubbleSort = O(1)


        }
    }

    static double fiboFormula(int n) {

//        return  (int)((Math.pow((1 + Math.sqrt(5) / 2), n) - Math.pow((1 + Math.sqrt(5) / 2), n)) / Math.sqrt(5));
        //Above one was actual formula for fibo No.

        return (long) ((Math.pow((1 + Math.sqrt(5) / 2), n)) / Math.sqrt(5));
        //same as previous but less dominating term is ignored
    }


    static void bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    //swap
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
