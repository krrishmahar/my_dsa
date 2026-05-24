package practice.arrays;

import java.util.Arrays;

public class rotate90Deg {
    static void rotate(int[][] matrix) {
        //transpose the shit
        for (int i =0; i< matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
//                swapNum(matrix[i], i, j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the arr
        for (int i =0; i< matrix.length; i++) {
            int l = 0, r = matrix.length-1;
            while (l<r) {
//                swapNum(matrix);
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++; r--;
            }
        }
    }

    private static void swapNum(int[] mat, int val1, int val2) {
        //call by value or call by address -> inplace
        int temp = mat[val1];
        mat[val1] = mat[val2];
        mat[val2] = temp;
    }

    static void main() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] num : matrix) {
            System.out.println(Arrays.toString(num));
        }
    }
}
