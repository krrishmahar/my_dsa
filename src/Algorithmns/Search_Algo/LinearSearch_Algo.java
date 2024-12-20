package Algorithmns.Search_Algo;

import java.util.Scanner;

public class LinearSearch_Algo {

    static int LinearSearch(int[] arr, int target) {//search for value and returns index.

        //1.Search for item's index in Array, if no items in array it returns -1.
        if (arr.length == 0) {
            return -1;
        }


        //2.run a loop to earch it
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                System.out.println("Item founded, item is located at index ");
                return index;

            }
        }
        //if not such item in array then returns -1.
        return -1;
    }

    static int LinearSearch2(int[] arr, int target) {//search for value and returns value.

        //1.Search for item's index in Array, if no items in array it returns minimum limit.
        if (arr.length == 0) {
            return Integer.MIN_VALUE;

        }

        //2.run a loop to search it and returns the element in it.
        for (int element : arr) {
            if (element == target) {
                System.out.println("element founded, ");
                return element;

            }
        }
        //if not such item in array then returns max limit since -1 might be a value.
        return Integer.MAX_VALUE;

    }

    static boolean LinearSearch3(int[] arr, int target) {//search for value and returns true and false.

        //1.Search for item's index in Array, if no items in array it returns minimum limit..
        if (arr.length == 0) {
            return false;
        }

        //2.run a loop to search it and returns the element in it.
        for (int element : arr) {
            if (element == target) {
                System.out.println();
                return true;

            }
        }
        //if not such item in array then returns false.

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {12, 3, 1, 3, 1352};
        int target = sc.nextInt();
//        int ans = LinearSearch(nums, target);
//        System.out.println(ans);
        int ans2 = LinearSearch2(nums, target);
        System.out.println(ans2);
//        boolean ans3 = LinearSearch3(nums, target);
//        System.out.println(ans3);


    }
}
