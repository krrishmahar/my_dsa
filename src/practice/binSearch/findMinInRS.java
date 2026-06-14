package practice.binSearch;

public class findMinInRS {
//    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

    static int findMin(int[] nums) {
        int s =0, e = nums.length-1;
        while (s<e) {
            int mid = s + (e-s)/2;
            if (nums[mid] > nums[e]) {
                s = mid+1;
            } else {
                e = mid;
            }
            if (nums[mid] > nums[mid+1] && mid < e)  return nums[mid+1];
        }
        return nums[s];
    }
}
