package Algorithmns.Sort_Algo;

public class MergeSort_Algo {
    static void mergeSort(int[] arr){
    if (arr.length > 1){
        mergesort(arr, 0 , arr.length-1);
    }
    }
    private static void mergesort(int[] arr, int l, int h){
        if (l<h){
            int mid = l + (h-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, h);
            merge(arr, l, mid, h);
        }
    }


    private static void merge(int[] arr, int l, int m, int r) {
        // lengths of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        // merge back to arr
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        // copy remaining
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 7, 5, 6, 2, 8};
        mergeSort(arr1);
        System.out.println("Recursive: " + java.util.Arrays.toString(arr1));

        int[] arr2 = {4, 1, 9, 6, 3, 8};
        mergeSort(arr2);
        System.out.println("Iterative: " + java.util.Arrays.toString(arr2));
    }
    }


