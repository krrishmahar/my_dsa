package Java_DSA.Recursion;

import java.util.Arrays;

public class Recursion_16 {

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {//if in main left call there is more than 1 number, arrange them.
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        //It may be possible that comparison is not even, like arr1 = 5 elements and arr2 = 3 elements
        //In that case, copy the remaining elements of arr1 in end of array.
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;//return every element in array mix and check next main call or sub-call.
    }

    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 2, 1, 10, 9};
        arr1 = mergeSort(arr1);
//        System.out.println(Arrays.toString(arr1));

//      Merge Sort inplace->
        int[] arr2 = {5, 4, 3, 2, 1};
        mergeSortInplace(arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSortInplace(arr, 0, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s <= 1) {
            return;
        }
        int mid = s + (e - s) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }

    private static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {//if in main left call there is more than 1 number, arrange them.
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }


        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];

        }
    }
}
