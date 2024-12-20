package Algorithmns.Sort_Algo;

import java.util.Arrays;

public class SelectionSort_Algo {

//    Selection sort is basically sorting elements starting from index 0->Selecting distorted ones->swap in right place.
//    Best Case -> O(n^2)
//    Worst Case -> O(n^2)
//    It is not a Stable sorting Algorithms and performs well in Small list.

//    Mechanism -> Similar to Bubble sort.
//    ->Search from index 0 to end while selecting one distorted element and swapping it with element of right place.
//    ->Proceeds while decreasing the search space.
    //It runs the loop in (n - i -1) times

    public static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //Find the max item and swap it with correct index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);//search for max index value

            swap(arr, maxIndex, last);//swaps max value and last, place every large No. in end.


        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
}
