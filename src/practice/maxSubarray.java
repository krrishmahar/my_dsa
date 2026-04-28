package practice;

public class maxSubarray {

    //Optimized soln - Kadane's Algorithm
    // Time complexity = O(n)
    static int maxSubArray(int[] nums) {
        if (nums.length == 0)   return -1;
        int maxSum = Integer.MIN_VALUE, sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i],  nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    static int maxSubArray2(int[] nums) {
        if (nums.length == 0)   return -1;
        int maxSum = Integer.MIN_VALUE, sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            maxSum = sum > maxSum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }
        return maxSum;
    }

    static void main() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }
}
