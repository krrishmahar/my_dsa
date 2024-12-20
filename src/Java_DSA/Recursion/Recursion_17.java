package Java_DSA.Recursion;

import java.util.Arrays;

public class Recursion_17 {

    //    QuickSort by Recursion.
    protected static void QuickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr, low, e);
        QuickSort(arr, s, high);

    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
