package practice.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> generate(int numRow) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRow == 0) return result;

        List<Integer> rowFirst  = new ArrayList<>();
        rowFirst.add(1);
        result.add(rowFirst);

        if (numRow == 1) return result;

        for (int i=1; i < numRow; i++) {
            List<Integer> prev = new ArrayList<>(result.get(i - 1));
            List<Integer> row  = new ArrayList<>();

            row.add(1);
            for (int j=0; j<i-1; j++) {
                row.add(prev.get(j) + prev.get(j+1));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }

    static void main() {
        List<List<Integer>> result = generate(5);
//        for (int[] n  um: result) {
//            System.out.println(Arrays.toString(num));
//        }
        System.out.println(result);
    }
}
