package ques.week3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findDuplicate {

    public static void main(String[] args) {
        int[] nums= {1,3,4,2,2};
        System.out.println(Duplicate(nums));
    }
    static int Duplicate(int[] nums) {
        //applying cyclic sort
        int i=1;
        while (i< nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct])   swap(nums,i, correct);
            else i++;
        }
        return nums[nums.length-1];
//        return  nums;
    }

    //else

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


    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
