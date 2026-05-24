package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class insertIntervals {
    static int[][] insert(int[][] intervals, int[] newInterval) {
        int end =  intervals.length;
//        if (intervals.length <= 1) return intervals;

        int[][] result = new int[end+1][2];
        for (int i = 0; i < intervals.length; i++) {
            result[i] = intervals[i];
        }
        result[end] = newInterval;

        //Insert khatam

//        List<int[]> res = new ArrayList<>();
//        Collections.addAll(res, intervals);

        //Going by default Merge Interval method of O(n log n)
        Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));
//        for (int[] i : result) {
//            System.out.println(Arrays.toString(i));
//        }
        int[] curr = result[0];
        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < result.length; i++) {
            int[] next = result[i];
            //[1,2] next([3,6]) curr[1] next[0]
            if (curr[1] >= next[0]) {
                curr[1] = Math.max(curr[1],next[1]);
            } else {
                list.add(curr);
                curr = next;
            }
        }
        list.add(curr);

        return list.toArray(new int[list.size()][]);
    }

    static void main() {
        int[][] nums1 = new int[][] {{1,3}, {8, 10}, {15,18}};
        int[][] nums2 = {};
        int[] newIntervals = {2,6};
        System.out.println(nums1.length);
        int[][] result = insert(nums1, newIntervals);
        for (int[] i : result) {
            System.out.print(Arrays.toString(i) + " ");
        }
    }
}
