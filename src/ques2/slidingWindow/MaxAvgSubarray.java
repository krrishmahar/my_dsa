package ques2.slidingWindow;

public class MaxAvgSubarray {

    static double maxAvgSubarray(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;

        double windowSum = 0;
    
        for (int i = 0; i < nums.length; i++) {
            windowSum += nums[i];
    
            if (i >= k - 1) {
                maxAvg = Math.max(maxAvg, windowSum / k);
                windowSum -= nums[i - (k - 1)];
            }
        }
    
        return maxAvg;
    }


            public static void main(String[] args) {
        
            int[] arr1 = {1,12,-5,-6,50,3};
            int[] arr2 = {-1};
            int k = 4;
        
            double result = maxAvgSubarray(arr1, k);
            System.out.println("Maximum average of subarray of size " + k + " is: " + result);
            System.out.println(maxAvgSubarray(arr2, 1));
                System.out.println(Double.NEGATIVE_INFINITY+ "\n"+ Double.POSITIVE_INFINITY);
        }
}
