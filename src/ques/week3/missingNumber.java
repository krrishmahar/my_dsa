package ques.week3;


public class missingNumber {
//    https://leetcode.com/problems/missing-number/description/

    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i = 0;
        while ( i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])  swap(arr,i,correct);
            else i++;

        }

        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j)    return j;
        }
        return arr.length;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }


}
