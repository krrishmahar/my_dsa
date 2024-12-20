package ques.week3;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,6,5,};
        System.out.println(findDuplicate(arr));
    }

    //amazon: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

    static List<Integer> findDuplicate(int[] arr){
        int i = 0;
        while ( i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct])  swap(arr,i,correct);
            else i++;

        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j+1)    {
                list.add(arr[j]);
                list.add(j+1);
            }
        }
        return list;
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
