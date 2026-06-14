package practice.arrays;

/*
* Given an array arr[] and a number k, split the given array into k subarrays such that the
* maximum subarray sum achievable out of k subarrays formed is the minimum possible,
* find that possible subarray sum.

Examples:

    Input: arr[] = [1, 2, 3, 4], k = 3
    Output: 4
    Explanation: Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits.

    Input: arr[] = [1, 1, 2], k = 2
    Output: 2
    Explanation: Splitting the array as [1, 1] and [2] is optimal. This results is a maximum sum subarray of 2.

*/

import java.util.Map;

public class SplitKArrays {

    // Helper recursive function
    private int divide(int[] nums, int n, int k, int index) {
        if (k == 1) {
            int remainingSum = 0;
            for (int i = index; i < n; i++) {
                remainingSum += nums[i];
            }
            return remainingSum;
        }

        int minMaxSum = Integer.MAX_VALUE;
        int currentSubarraySum = 0;

        for (int i = index; i <= n - k; i++) {
            currentSubarraySum += nums[i];
            int maxInRemaining = divide(nums, n, k - 1, i + 1);
            int overallMaxForThisSplit = Math.max(currentSubarraySum, maxInRemaining);
            minMaxSum = Math.min(minMaxSum, overallMaxForThisSplit);
        }

        return minMaxSum;
    }

    public int naiveSoln(int[] nums, int k) {

        if (nums == null || nums.length < k) return -1;
        return divide(nums, nums.length, k, 0);
    }
}

class Answer {
    boolean status;
    String answerResult;
    int[] solutionAlgorithm;

    String Answer(int[] solutionAlgorithm, String answerType) {
        this.solutionAlgorithm=solutionAlgorithm;
        System.out.println("Initializing the question");

        //testing the question using testcases
        boolean testResult = runTestCases(solutionAlgorithm);
        if (answerType.equalsIgnoreCase("binary search")) {
            System.out.println("Optimized solution is utilized");
        } else {
            System.out.println("Solution is good but can be further optimized");
        }
        return "{" +
                "status" + ((testResult) ? "success" : "failure") +
                "}";
    }

    private boolean runTestCases(int[] solution) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{1, 2, 3, 4};
    return true;
    }

    private class Questions {
        Map<int[], Integer> tests;

//        Questions(int[] testcases, Integer k) {
//            tests = Map
//        }

    }
}
