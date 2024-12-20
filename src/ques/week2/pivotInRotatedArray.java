package ques.week2;

import Java_DSA.OOPs.EnumExample.A;

import java.util.ArrayList;
import java.util.Arrays;

public class pivotInRotatedArray {
    public static void main(String[] args) {
//        int[] nums = {
//                4, 5, 6, 7, 0, 1, 2
//        };

        int[] nums2 = {1,2};
        int[] nums3 = {3,4,5,2};


//        System.out.println(pivot(nums));
//        System.out.println(search(nums, 6));
//        System.out.println(3%7);

//        System.out.println(pivot(nums2));
//        System.out.println(findMin(nums));
        int n = 3;
        int[] ans = new int[2*n];
        int[] nums = new int[]{2,5,1,3,4,7};
        for (int i = 0; i < n; i+=2) {
//            for (int j = 0; j <n; j++) {
                ans = nums.clone();

//            }
        }
        String s = "krrish mahar";
        StringBuffer sh = new StringBuffer("krrish");
        sh.append(" mahar");
        StringBuilder shell = new StringBuilder("krrish");
        shell.append(" mahar");

//        ans[0] = 45;
//        System.out.println(ans.length);
//        System.out.println(Arrays.toString(ans));

    }

    static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if (pivot == -1) return BS(nums, target, 0, nums.length);
        else if (nums[pivot] == target) return pivot;

        if (target >= nums[0]) {
            return BS(nums, target, 0, pivot - 1);
        }

        return BS(nums, target, pivot + 1, nums.length - 1);
    }

    static int BS(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = end - (end - start) / 2;

            if (nums[mid] > target) end = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    static int pivot(int[] nums) {
        int start = 0, end = nums.length -1;
        while (start <= end) {
            int mid = end - (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid -1;
            if (nums[mid] <= nums[start]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    static int pivot2(int[] nums) {

        int start = 0, end = nums.length;
        while (start <= end) {
            int mid = end - (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            if (nums[mid] <= nums[start]) end = mid - 1;
            else start = mid + 1;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (nums[start] > nums[++start]) return start;
                start++;
                if (nums[end] < nums[--end]) return --end;
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }  else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        // If the array is not rotated (the smallest element is at the beginning)
        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid+1 is the minimum element
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Check if mid itself is the minimum element
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // Decide whether to go to the left half or the right half
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // This return statement should never be reached if the input array is a rotated sorted array
        return -1;
    }






}

