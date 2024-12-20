package ques2.slidingWindow;

//ques: Kadane's Algorithm : Maximum Subarray Sum in an Array
//leetcode: https://leetcode.com/problems/maximum-subarray/description/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSumSubarray {

    static int maxSubArray(int[] nums) {
        int sum =0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0)    sum=0;
        }
        return max;
    }

    //follow-up: print that subarray too
    static int maxSubArray2(int[] nums) {
        int sum =0, max = Integer.MIN_VALUE;
        int start =0, arrStart =-1, arrEnd =-1;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0)    start=i;
            sum += nums[i];
//            max = Math.max(max, sum);
            if (sum > max)   {
                max=sum;
                arrStart = start;
                arrEnd = i;
            }
            if (sum < 0)    sum=0;
        }

        //printing the array;
        int[] ans = new int[arrEnd - arrStart +1];
        for (int i = arrStart; i < arrEnd; i++) {
            ans[i - arrStart] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int ans = maxSubArray(nums);
        int ans2 = maxSubArray2(nums);
//        System.out.println(ans);
        System.out.println(ans2);

//        System.out.println(maxSubArray(new int[]{1,12,-5,-6,50,3})/4);

    }
}
