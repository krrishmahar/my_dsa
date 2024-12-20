package Java_DSA.Recursion;

import java.util.ArrayList;

public class Recursion_14 {


    public static void main(String[] args) {

//        int[] arr1_1 = {1,2,3,4,6,8,10};
//        System.out.println(ques1_1(arr1_1));
//        System.out.println(ques1_2(arr1_1,0));

//        int [] arr2 = {1,3,2,4,3,3,5,3,8,6,};
//        System.out.println(ques2_1(arr2,4,0));
//        System.out.println(ques2_2(arr2,3,0));
//        System.out.println(ques2_3(arr2,3, arr2.length - 1));
//
//        int [] arr3 = {1,3,2,4,3,3,5,3,8,6,};
//        ques3(arr3,3,0);
//        System.out.println(list);

//        int[] arr4 = {1,5,4,5,4,3,2,6,8,7,4};
//        ArrayList<Integer> list4 = new ArrayList<>();
//        ArrayList<Integer> ans4 = ques4(arr4,4,0,new ArrayList<>());
////        ArrayList<Integer> ans4 = ques4(arr4,4,0,list4);
//        System.out.println(ans4);

//        int[] arr5 = { 1,2,3,3,6,8,9,4,3};
//        ArrayList<Integer> ans5= ques5(arr5,3,0);
//        System.out.println(ans5);

        int[] arr6 = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int ans6 = rotatedBS(arr6, 2, 0, arr6.length - 1);
        System.out.println(ans6);
    }

    static int rotatedBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] < arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return rotatedBS(arr, target, s, mid - 1);
            } else {
                return rotatedBS(arr, target, mid + 1, e);
            }
        }

        if (target >= arr[mid] && target <= arr[e]) {
            return rotatedBS(arr, target, mid + 1, e);
        }

        return rotatedBS(arr, target, s, mid - 1);
    }

    static ArrayList<Integer> ques5(int[] arr, int target, int index) {
        //This meth is not very optimised hence use meth ques4.
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        //This will contain answers for that function call only.
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = ques5(arr, target, index + 1);

        list.addAll(ansFromBelowCall);

        return list;
    }

    static boolean ques2_1(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || ques2_1(arr, target, index + 1);
    }

    static int ques2_2(int[] arr, int target, int index) {//returns the index
        if (index == arr.length) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        }
        return ques2_2(arr, target, index + 1);
    }

    static int ques2_3(int[] arr, int target, int index) {//returns the index but is in descending order
        if (index == -1) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        }
        return ques2_3(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void ques3(int[] arr, int target, int index) {//returns the index of multiple duplicate elements.
//        This function does not return anything but just stores target integers into an ArrayList.
        if (index == arr.length) {
            return;//if no element in array, just return -1;
        } else if (arr[index] == target) {
            list.add(index);//Instead of returning index, add index in list and ya gotta sout the list.
        }

        ques3(arr, target, index + 1);
    }

    static ArrayList ques4(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {//if index is finally at end then return list.
            return list;//This list is returned from recursion formula.
        } else if (arr[index] == target) {
            list.add(index);
        }

        return ques4(arr, target, index + 1, list);//Recursion formula
    }

    static boolean ques1_1(int[] arr) {//Iteratively
        for (int i = arr[0]; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }

    static boolean ques1_2(int[] arr, int index) {//index variable since we are not going to iterate it with loop.
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && ques1_2(arr, index + 1);

    }

}
