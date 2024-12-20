package Algorithmns.Sort_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is Doc of questions on Cycle Sort.
 * <i>Problem 1 : Find Missing Number</i>
 *
 * @see <a href = "file:///C:/Users/Mahar/IdeaProjects/untitled/src/Data_Structures/Sort_Algo/CycleSort_Algo.html" target ="_blank">Java Docs</a>
 */
public class CycleSort_IMP {

    //Question 1 : Find the Missing Number.
    //Leetcode : https://leetcode.com/problems/missing-number/
    static int MissingNumber(int[] arr) {
        //This will put numbers in their correct index while the number that is out of bound is at end.
        int i = 0;//indicates index 0
        while (i < arr.length) {
            int correct = arr[i];//every index contains same element as index, 0->0,1->1,etc.
            if (arr[i] < arr.length && arr[i] != arr[correct]) {//starting value not in its correct index(4)
                swap(arr, i, correct);
            } else {//If index is out of bound then skip.
                i++;
            }
        }

        //Search for first mising No.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }

        }
        //case 2
        return arr.length;
    }

    private static int swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return temp;
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of integers from 0 to n

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    //Question 2 : Find all the Missing index in the Array. ->> Google Question.
    //let range be 1 -> n.
    //Leetcode : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    static List<Integer> FindAllMissing(int[] arr) {
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

        //just find the Missing No.
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) { //value = index-1 then index - value +1
                ans.add(index + 1);

            }
        }
        return ans;
    }

    //Question 3 : Find one duplicate No. ->> Amazon and Microsoft
//    Leetcode :https://leetcode.com/problems/find-the-duplicate-number/

    static int DuplicateNo(int[] arr) {
        //range : 1->n
        int i = 0;//indicates index 0
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    //Question 4 : Find all duplicate in the array. -> Can find multiple duplicates.
//    Leetcode : https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    //Question 5 : Set Mismatch -> Same as Q no. 1 & 3.
//    ->You have a set of integers s, which originally contains all the numbers from 1 to n.
//    Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
//    which results in repetition of one number and loss of another number.

    //    Leetcode : https://leetcode.com/problems/set-mismatch/
    static int[] findErrorNums(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //Search for first mising No.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return new int[]{arr[index], index + 1};//
            }

        }
        //case 2
        return new int[]{-1, -1,};
    }

    //Question 6 : Find Missing Positive ->> Amazon
//    ->This Question is tricky since it doesn't say that range is 1->n, SO hard to know if cycleSort is used or not.
    //Question is sort array
/*    Given an unsorted integer array nums, return the smallest missing positive integer.
    You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.*/
//  Leetcode : https://leetcode.com/problems/first-missing-positive/

    static int missingPositive(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {//additional condition
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //Search for first mising No.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return index+1;//
            }

        }
        //case 2
        return arr.length+1;
    }


    public static void main(String[] args) {

        int[] arr1 = {4, 0, 2, 1};
//        missingNumber(arr1);
        MissingNumber(arr1);
//        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {4, 3, 2, 7, 8, 2, 3, 1, 2};
        FindAllMissing(arr2);
//        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 2, 6, 5, 3, 1};
        DuplicateNo(arr3);
//        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1, 1, 2, 3, 3, 5};
        findDuplicates(arr4);
//        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {1, 2, 2, 4};
        findErrorNums(arr5);
//        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {1,2,0};
//        missingPositive(arr6);
//        System.out.println(Arrays.toString(arr6));
        System.out.println(missingPositive(arr6));


    }
}
