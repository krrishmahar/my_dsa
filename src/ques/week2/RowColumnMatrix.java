package ques.week2;

import java.util.Arrays;

public class RowColumnMatrix {

    public static void main(String[] args) {
    int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
    };

        System.out.println(Arrays.toString(search(arr, 13)));
    }

    static  int[] search(int[][] arr, int target){
        int r = 0, c = arr.length-1;

        while (r< arr.length && c >= 0){
            if (arr[r][c] == target) return new int[]{r,c};
            if (arr[r][c] < target) r++;
            else c--;
        }
    return new int[]{-1,-1};
    }
}
