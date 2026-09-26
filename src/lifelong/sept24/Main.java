package lifelong.sept24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int[] ques1N2 = {
            -1, 0, 1, 2, -1, -4
        };
        List<List<Integer>> res = threeSum(ques1N2);
        System.out.println(res);

        int closestSum = threeSumClosest(ques1N2,1);
        System.out.println(closestSum);
    }

/*  3Sum
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        if (n < 2)    return res;
        for (int i=0; i < n-2; i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while (l < r){
                int sum = nums[l]+nums[r] + nums[i];
                if (sum < 0)    l++;
                else if (sum > 0) {
                    r--;
                }else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l<r && nums[l] == nums[l+1]) l++;
                    while (l<r && nums[r] == nums[r-1]) r--;
                }
            }
        }
    return res;
    }

    //3Sum Closest
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans=0;
        for (int i =0; i<n-2; i++) {
            int l = i+1, r = n-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum;
                }
            }
        }
        return ans;
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
