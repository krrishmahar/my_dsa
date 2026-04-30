package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals {

    static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0])); //Use this it is 2ms faster (recommended)
//        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]) );
        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (curr[1] >= next[0]) {
                curr[1] = Math.max(curr[1], next[1]);
            }else {
                res.add(curr);
                curr = next;
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }

    static void main() {
    int[][] nums1 = {{1,3},{2,6}, {8, 10}, {15,18}};
    int[][] nums2 = {{4,7}, {1,4}};
        System.out.println(nums1.length);
    int [][] ans = merge(nums1);

    for (int[] i : ans) {
        System.out.println(Arrays.toString(i));
    }
    }
}
