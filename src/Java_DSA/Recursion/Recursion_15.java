package Java_DSA.Recursion;

import java.util.Arrays;

public class Recursion_15 {


    public static void main(String[] args) {
////ques1(4,0);
//        System.out.println();
//ques2(4,0);

//        int[] bubblesort = {4,3,2,1};
//        ques3(bubblesort, bubblesort.length-1,0);
//        System.out.println(Arrays.toString(bubblesort));

        int[] selectionSort = {1, 5, 8, 3, 7, 4, 9, 2};
        ques4(selectionSort, selectionSort.length, 0, 0);
        System.out.println(Arrays.toString(selectionSort));


    }

    static void ques4(int[] arr, int last, int first, int max) {
        if (last == 0) {
            return;
        }

        if (last > first) {
            if (arr[first] > arr[max]) {//Initially, max will be initiated as index 0;
                ques4(arr, last, first + 1, first); //if arr[c] > arr[max] and max will be c
            } else {//So, it recall func while increasing column and no change in max = 0
                ques4(arr, last, first + 1, max);
            }
        } else {//when r=c i.e, all have checked, it swaos max by r-1;
            //And all fuckin' process repeats and shit complexity.
            int temp = arr[max];
            arr[max] = arr[last - 1];
            arr[last - 1] = temp;
            ques4(arr, last - 1, 0, 0);
        }

    }

    static void ques1(int r, int c) {

        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            ques1(r, c + 1);
        } else {
            System.out.println();
            ques1(r - 1, 0);
        }
    }

    static void ques2(int r, int c) {

        if (r == 0) {
            return;
        }
        if (c < r) {
            ques2(r, c + 1);
            System.out.print("*");
        } else {
            ques2(r - 1, 0);
            System.out.println();
        }
    }

    static void ques3(int[] arr, int r, int c) {

        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            ques3(arr, r, c + 1);
        } else {
            ques3(arr, r - 1, 0);
        }
    }

    private static void swap(int[] arr, int r, int c) {
        int temp = arr[r];
        arr[r] = arr[c];
        arr[c] = temp;

    }
}
