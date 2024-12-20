package ques.week3;

import java.util.ArrayList;
import java.util.List;

public class numberDisappered {
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    //asked in google
public static void main(String[] args) {

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=1;
        while (i<nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct])   swap(nums,i,correct);
            else    i++;
        }
        List<Integer> list = new ArrayList<>();
        for (int in=0;in<nums.length;in++){
            if (nums[in] != in+1)  list.add(in+1);
        }
        return list;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
