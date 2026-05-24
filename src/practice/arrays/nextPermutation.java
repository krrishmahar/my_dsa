package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nextPermutation {

         void nextPermutation(int[] nums) {
            int n = nums.length;

            // Step 1: find breakpoint
            int i = n - 2;
            while (i >= 0 && nums[i] >= nums[i + 1])    i--;

            // Step 2: find next greater element and swap
            if (i >= 0) {
                int j = n - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }

            // Step 3: reverse the suffix
            reverse(nums, i + 1, n - 1);
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

     void main() {
        int[] nums = {1,2,3};
         nextPermutation(nums);
         System.out.println(Arrays.toString(nums));
         }
}
