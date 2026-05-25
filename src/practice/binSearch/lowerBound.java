package practice.binSearch;

public class lowerBound {
    /*
    * Given a sorted array arr[] and a number target, find the lower bound of the target
    * in this given array. The lower bound of a number is defined as the smallest index
    * in the sorted array where the element is greater than or equal to the target.
    * */

    /*
  * Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
    Output: 3
    Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.

    Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
    Output: 4
    Explanation: 4 is the smallest index in arr[] where element (arr[4] = 11) is greater than or equal to 11.

    Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 100
    Output: 7
    Explanation: As no element in arr[] is greater than 100, return the length of array.
  * */

    // Naive Approach -> linear search O(n)
    static int answer(int[] nums, int target) {
        for (int num : nums) {
            if (num >= target) return num;
        }
        return -1;
    }

    //Best Approach -> Binary Search O(log n)
    static int bestAnswer(int[] nums, int target) {
        int low=0, high = nums.length-1;
        int res = Integer.MIN_VALUE;

        while (low<high) {
            int mid = low + (high-low)/2;
            if (nums[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }
        }
        return res;
    }



//        static int wrong answer(int[] nums, int target) {
//        if (nums.length == 0)   return -1;
//        int ans = 0;
//        int max = nums[0];
//        for (int i=0; i<nums.length; i++) {
//            ans = (nums[i] < target) ? Math.max(nums[i], max) : ans;
//        }
//        return ans;
//    }


    static void main() {
        int[] ques = {2, 3, 7, 10, 11, 11, 25};
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        System.out.println(answer(ques, 100));
        int ans = bestAnswer(arr, target);
        System.out.println("The value is "+arr[ans] +" of index "+ ans);

    }
}
