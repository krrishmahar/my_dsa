package Algorithmns.Sort_Algo;

import java.util.Arrays;

public class InsertionSort_Algo {

    //Space Complexity will be O(1) -> Constant. -> will not require new array to search i.e, inplace sorting algorithm.
    //For Time Complexity :
    //Best case  -> O(n)   -> Linear Complexity-> Pre-Sorted
//    -> It makes N-1 comparison. -> For 10 elements -> 9 comparisons.
    //Worst case -> O(n^2) -> Sorted in opposite order(Distorted) -> sorting des array in ascending order.
//    -> It makes (N^2 - N) / 2 comparison. -> For 10 elements -> 45 comparisons.

    //Why Use Insertion Sort?
  /*->Stable sorting algorithm
  ->It takes part in hybrid sorting algorithms


*/

//    Working of Insertion Sort ->
//    It has 2 pointer(i = 0 & j = i - 1 ), j will check left side and swap if arr[left] > arr[right]
    //For outer loop of i, it will run from (i=0; i =arr.length - 2;i++)
    //For inner loop of j, (j=1; j<0; j++) i.e, while (true) and lastly j=arr.length and
//          int[] arr= {5, 3, 4, 1, 2};
// pass1:   int[] arr= {3, 5, 4, 1, 2};
// pass2:   int[] arr= {3, 4, 5, 1, 2};
// pass3:   int[] arr= {1, 3, 4, 5, 2};
// pass4:   int[] arr= {1, 2, 3, 4, 5};

//

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = i + 1; j > 0; j--) {//since in pass1, j=i+1 = 0+1= 1 then, in pass2, i=1 and j=2 and proceeds
                // after i = end( 5 ), j will  decrease and check right side.
                if (arr[j] < arr[j - 1]) {// And arr[j](3) is lesser than arr[j-1](5), will swap 5 by 3
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

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
        int[] arr = {5, 3, 4, 12, 1, 2};
        int[] arr2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Insertion(arr);
        Insertion(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
    }
}
