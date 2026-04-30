package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // [f, f, f] 1 2 3
        backtrack(result, new ArrayList<Integer>(), nums, used);
        return result;
    }

    ///Using boolean[] makes it take O(n!) time instead of O(n! * n) where n was due to temp.contains(nums[i])
    /// Space complexity with outputs (nums[] stored) will be O(n! * n)
    /// Auxiliary Space complexity will be O(n)
    ///
    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i<nums.length; i++) {
            // if (temp.contains(nums[i]))   continue;  ///This shit takes O(n) time making it O(n!*n) time
            if (used[i]) continue;

            temp.add(nums[i]); // [t, f, f] 1 2 3
            used[i] = true;
            backtrack(result, temp, nums, used); // [t, t, t]
            temp.removeLast();
            used[i] = false; // [t, t, f]
        }
    }

    static void main() {

    }
}
