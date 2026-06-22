package practice.slidingWindow;

public class longestSubarrayOfOnes {
    static int longestSubarray(int[] nums) {
        int s = 0, r = 0;
        int count = 0, maxCount = 0;
        boolean deleted = false;
        while (r < nums.length) {

            if (nums[r] == 0) {
                r++;
                deleted = true;
            }
            if (deleted && nums[r] == 0) {
                count -= nums[s];
                s++;
            }
            count += nums[r];
            maxCount = Math.max(count, maxCount);
            r++;
        }
        return maxCount;
    }

    static void main() {

    }
}
