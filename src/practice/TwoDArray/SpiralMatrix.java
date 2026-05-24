package practice.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix) {
        int resultSize = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<>(resultSize);

        int top = 0, bottom = matrix.length - 1;
        int left =0, right  = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            //Move Left to Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            
            //Move Top to Bottom;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //Move Right to Left
            if (top <= bottom){
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //Move Bottom to Top
            if (left <= right){
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    static void main() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrix2 = {
                {1,2,3}
        };
        int[][] matrix3 = {
                {1},
                {2},
                {3}
        };

        System.out.println(spiralOrder(matrix));
////        System.out.println(spiralOrder(matrix2));
//        System.out.println(spiralOrder(matrix3));
    }
}
