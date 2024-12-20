package ques.week1;

public class mountain_array {

//    leetcode: https://leetcode.com/problems/find-in-mountain-array/description/
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1};
    System.out.println(search(arr,3));


}

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int first = orderAgnostic(arr,target,0,peak);
        if (arr[first] != -1) return first;
        int second = orderAgnostic(arr,target,peak,arr.length-1);
        if (arr[second] != -1) return first;

        return -1;

    }

    static int orderAgnostic(int[] arr, int target, int start, int end){
        int mid = -1;
        boolean isAsc = arr[start] <= arr[end];

        if (isAsc){
            while (start < end){
                mid = start - (start- end)/2;
                if (arr[mid] > target) end = mid-1;
                else if (arr[mid] < target) start = mid + 1;
                else return mid;
            }
        }else {
            while (end < start){
                mid = start - (start- end)/2;
                if (arr[mid] > target) start = mid+1;
                else if (arr[mid] < target) end= mid - 1;
                else return mid;
            }
        }
        return mid;
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
