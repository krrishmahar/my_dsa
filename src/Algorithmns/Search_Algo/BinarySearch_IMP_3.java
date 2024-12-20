package Algorithmns.Search_Algo;

import java.util.Arrays;

public class BinarySearch_IMP_3 {

    //Searching inn Multidimensional array by using Binary search,
//    This has Best case of O(n) time complexity.
//    This has Worst case of O(n^2) time complexity.
//    Since, it has to search 2 arrays(row & column) it will have 3 cases.
    //Case 1 -> if(element == target){ return element;}
    //Case 2 -> if(element < target){ return element;}
    //Case 3 -> if(element > target){ return element;}

    //Considering a 3X4 matrix, target = 69; with upper bound = 1; lower bound = 9;
    // int[][] matrix = { {10, 20, 25, 30},
//                        {42, 55, 58, 60},
//                        {60, 69, 75, 79},
//                        {80, 84, 90, 95} }
    //By using this algorithm, we'll create two pointers that search the matrix.
    //1st pointer search from index 0,0 (10) to index 4,0 (80)-> will search rows.
    //2nd pointer will be fixed at end column(having the highest value)
    // And will only decrease when element is lesser than element at end.
    //2nd pointer search from index 0,4 (30) to index 0,0 (10)-> will search columns.

    //Question 1 : Row column Matrix
    public static void main(String[] args) {
//    int [][] arr1=  { {10, 20, 25, 30},
//                     {42, 55, 58, 60},
//                     {60, 69, 75, 79},
//                     {80, 84, 90, 95}   };
//    int[] ans1 = search1(arr1,69);
//        System.out.println(Arrays.toString(ans1));// will give index where 69 is located, [2, 1].

        //Question 2 : Sorted Matrix.
        //This has time complexity of, O (log n + log m)


        int[][] arr2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(Arrays.toString(search2(arr2, 15)));


    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;

            } else {
                cEnd = mid - 1;

            }

        }
        return new int[]{-1, -1};
    }

    static int[] search2(int[][] matrix, int target) {
        int row = matrix.length;
        ;
        int column = matrix[0].length;//Be cautious since matrix may be empty.
        //Initially column search begins from 0th row.

        if (row == 1) {//means there is only one row then,
            return binarySearch(matrix, 0, 0, column - 1, target);

        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = column / 2;

        //run the loop till 2 loops are remaining.
        while (rStart < (rEnd - 1)) { //while this is true it will have more than 2 rows.


            int mid = rStart + (rEnd + rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
//                creates new array of {}
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
//          Now we have 2 rows left to search.
            //check whether the target is in column of 2 rows.
            if (matrix[rStart][cMid] == target) {
                return new int[]{rStart, cMid};
            }
            if (matrix[rStart + 1][cMid] == target) {
                return new int[]{rStart + 1, cMid};
            }
            //search in 1st half
            if (target <= matrix[rStart][cMid - 1]) {
                return binarySearch(matrix, rStart, 0, cMid - 1, target);
            }
            //search in 2nd half
            if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]) {
                return binarySearch(matrix, rStart, cMid + 1, column - 1, target);
            }
            //search in 3rd half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
            }
            //search in 4th half
            else {
                return binarySearch(matrix, rStart + 1, cMid + 1, column - 1, target);
            }

        }


        return new int[]{-1, -1};
    }


    //Just debug it, it is easy AF
    static int[] search1(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }

}
