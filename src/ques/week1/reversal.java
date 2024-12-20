package ques.week1;

import java.util.Arrays;

public class reversal {

    static void reverse(int[] arr){
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
                swap(arr,i,j);
                j--;
        }
    }

    static void reverse2(int[] arr){
        int start =0;
        int end = arr.length - 1;
        while (end > start){
            swap(arr,start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
    }




    public static void main(String[] args) {

        int[] arr;
        arr = new int[] {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
