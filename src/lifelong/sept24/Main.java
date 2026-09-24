package lifelong.sept24;

import java.util.Arrays;

public class Main {
    /*
   Questions I did today were:
       - Squares of a Sorted Array
       - 3Sum
       - 3Sum Closest
       - Subarray Product Less Than K
       - Sort Colors (leetcode) / Dutch National Flag problem
       - 4Sum --> 2 ways - triple loop O(n3) time
                         - kSum with same O(n3) time n cube
   */
    static void main() {

    }

    //3Sum Smaller
    //https://www.lintcode.com/problem/3sum-smaller/description
    public static int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum >= target){
                    r--;
                }else {
                    // All values between l and r work
                    count += r-l;
                    l++;
                }
            }
        }

        return count;
    }
}
