package Algorithmns.Sort_Algo;

import java.util.Arrays;

public class CycleSort_Algo {

//    Cyclic sort is the simple(easiest) and most asked sort in Interviews.
//    In an unsorted array with range of 1 to N, just Use Cyclic Sort.
    //Best Case  -> O(n) -> reason why best sorting method -> pre-sorted.
    //Worst Case -> O(n)
//E.g : int[] arr = {5,4,3,2,1};
   /* Pass1 : arr = {4,3,2,1,5};
      Pass2 : arr = {3,2,1,4,5};
      Pass3 : arr = {2,1,3,4,5};
      Pass4 : arr = {1,2,3,4,5};

    Note : If range is 0->n then No. is in indexes of same value.
           If range is 1->n then No. is in indexes of N-1.

           For Duplicate Elements the cases are -:
           case 1 : int[] arr = {3,5,1,2,4,3,6};
                    Ans : arr = {1,2,3,4,5,6,3}; duplicate element at end.
           case 2 : int[] arr = {2,1,3,3,7,4,6};
                    Ans : arr = {1,2,3,4,3,6,7}; duplicate element in place of missing element.


    */


    static void sort(int[] arr) {
        //This sort is from 1 to nth No. only. Can't search 0.
        int i = 0;//indicates index 0
        while (i < arr.length) {
            int correct = arr[i] - 1;//correct will be 5-1 =4th index i.e, from 0th index to n-1 index
            if (arr[i] != arr[correct]) {//starting value not in its correct index(4)
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private static int swap(int[] arr, int start, int end) {
        boolean correct;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 2, 8, 3, 4, 10, 1, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
