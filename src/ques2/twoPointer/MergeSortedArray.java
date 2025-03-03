package ques2.twoPointer;
import java.util.*;
public class MergeSortedArray {

//    Solution: https://leetcode.com/problems/merge-sorted-array/solutions/6487936/thought-process-for-merge-sorted-array-p-tn8g/
//    worst case time is of O(m*n)
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                for (int k = m - 1; k >= i; k--) {
                    nums1[k + 1] = nums1[k];
                }
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            } else {
                i++;
            }
        }

        // If any elements left in nums2, copy them
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(nums1));
    }

//    Better answer with O(m+n) worst case time
    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n -1;

        if (m==0){
            for (int p=0; p<n; p++)
                nums1[p] = nums2[p];
        }

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }



        if(j>=0)
            for(int p=j;p>=0;p--)
                nums1[p]=nums2[p];

    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,0,0,0};
        int[] arr2 = {1,2,3};
        merge(arr,3,arr2,3);
        merge2(arr,3,arr2,3); // better
    }
}
