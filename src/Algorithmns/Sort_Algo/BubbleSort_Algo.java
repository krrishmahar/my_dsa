package Algorithmns.Sort_Algo;


import java.util.Arrays;

public class BubbleSort_Algo {

    //In Bubble Sort, comparison is done between adjacent two elements. And depending on numerical value, it is swapped.
    //Bubble Sort is also known as Sinking sort or Exchange Sort.

    //Space Complexity will be O(1) -> Constant. -> will not require new array to search i.e, inplace sorting algorithm.
    //For Time Complexity :
//    Best Case -> O(n) -> Pre-Sorted(No Distortion) -> time = size of input. will grow as input grows.
//    Worst Case -> O(n^2) -> Sorted in opposite order(Distorted) -> sorting des array in ascending order.

    //Working of Bubble Sort ->
//          This Algorithm creates two pointer-like objects, namely, Counters(i & j).
//          These counter works on array as passes.
//          Comparison and swapping occurs between element and its previous element.
//    Pass 1: i= Pass element(1) and j = end element.
//    Pass 2: i= Pass element(2)  and j = end - 1.
//    Pass 3: i= Pass element(3)  and j = end - 1 - 1.
    //These passes will run in (input)N - 1 order and will search only till

    //E.g ->
//      In Pass 1,
//    int [] arr = {3,1,5,4,2};
//    after 1st sorting : arr = {1,3,5,4,2};
//    then, arr {1,3,4,5,2};
//    then, arr= {1,3,4,2,5};

//      In Pass 2,
//    arr = {1,3,2,4,5};
//      In Pass 3,
//    arr = {1,2,3,4,5};

    //Sorting algorithm can be stable sorting or unstable sorting.
//    E.g -> int[] arr = { 10, २॰, 20, 30, 40, 50, १॰};
//    Stable sorting -> arr = { 10, १॰, २॰, 20, 30, 40, 50};   : Original order is maintained as per original array.
//    Unstable sorting -> arr = { १॰, 10, 20, २॰, 30, 40, 50}; : Original order is disregarded.


    public static void main(String[] args) {
        int[] arr1 = {6, 1, 3, 5, 4, 2};
        bubbleSort(arr1);

        System.out.println(Arrays.toString(arr1));

//        int[] arr2 = { 10, 20, 30, 40, 50};
//        bubbleSort(arr2);
//        System.out.println(Arrays.toString(arr2));
//
//        String[] arr3 = { "10", "२॰", "20", "30", "40", "50", "१॰"};
//        bubbleSort2(arr3);
//        System.out.println(Arrays.toString(arr3));

//        bubbleSort3(arr3);
//        System.out.println(Arrays.toString(arr3));


    }

    static void bubbleSort(int[] arr) {
        boolean swapped;//using this bool method helps to break array if pre-sorted.

        for (int i = 0; i < arr.length; i++) {
//  for each step, max item will come at last respective  index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {// As 2nd pass initiates, end = end-i;
                //due to j< arr.length-1, it will only run till distorted element,
//  swap if item is smaller than previous one.
                if (arr[j] < arr[j - 1]) {
//                if (arr[j] > arr[j - 1]){ for descending one
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

//                if (!swapped){//should not be in inner loop bcuz, it will give error.
//                    break;
//                }
            }//If no element is swapped in inner loop, array is already sorted.
            if (!swapped) {
                break;
            }
        }

    }

    static void bubbleSort2(String[] arr) {
        //will give unstable sorting

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }

    }

    static void bubbleSort3(String[] arr) {
        //will give stable sorting

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (compare(arr[j], arr[j - 1]) < 0) {//uses compare meth to give stability/proper order.
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }

    }

    private static int compare(String str1, String str2) {
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        return Integer.compare(num1, num2);
    }

}
