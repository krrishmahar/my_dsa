package practice.TwoDArray;

import java.util.Arrays;

public class transposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int len = matrix.length;
        int row = len, col = matrix[0].length;
        int[][] result = new int[col][row];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static void main() {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7,8,9}};
        int[][] result = transpose(matrix);
        for (int[] num : result) {
            System.out.println(Arrays.toString(num));
        }
    }
}
