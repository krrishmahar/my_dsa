package ques.week1;

public class PeakIndexMountainArray {

//    leetcode: https://leetcode.com/problems/find-peak-element/submissions/1289062527/
//    leetcode: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start =0,end = arr.length -1;
        int mid = -1;

        while (start < end) {
            mid = start - (start - end)/2;
            if (arr[mid] > arr[mid+1]) end = mid;
            else  start = mid +1;
        }

        return end;
    }
}
