package ques.week2;

import java.util.Arrays;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(Arrays.toString(search(arr2, 1)));
    }

    static int[] binarySearch(int[][] arr,int row, int cStart, int cEnd, int target){

        while (cStart< cEnd){
            int mid = cStart - (cStart - cEnd)/2;
            if (arr[row][mid] == target) return new int[]{row, mid};
            if (arr[row][mid] < target)  cStart = mid +1;
            else cEnd = mid -1;

        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] arr, int target){
        int r = arr.length;
        int c = arr[0].length;

        //edge case
        if (r == 1)     return binarySearch(arr,0,0, c-1,target);

        int rStart = 0, rEnd = r -1;
        int cMid = c/2;

        while (rStart < (rEnd -1)){
            int mid = rStart + (rEnd -rStart)/2;

            if (arr[mid][cMid] == target)   return new int[] {mid,cMid};
            if (arr[mid][cMid] < target)    rStart = mid;
            else rEnd = mid;

            if (arr[rStart][cMid] == target)    return new int[] {rStart,cMid};
            if (arr[rStart+1][cMid]==target)    return new int[] {rStart+1,cMid};


            //search in 1st half
            if (target <= arr[rStart][cMid - 1]) {
                return binarySearch(arr, rStart, 0, cMid - 1, target);
            }
            //search in 2nd half
            if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][c - 1]) {
                return binarySearch(arr, rStart, cMid + 1, c - 1, target);
            }
            //search in 3rd half
            if (target <= arr[rStart + 1][cMid - 1]) {
                return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
            }
            //search in 4th half
            else {
                return binarySearch(arr, rStart + 1, cMid + 1, c - 1, target);
            }
        }
        return new int[]{-1, -1};
    }

}
