package ques.week1;

public class CeilingOfNumber {
//    leetcode: https://leetcode.com/problems/search-insert-position/solutions/1729111/java-100-ceiling-of-number/

    //ceiling of target means number >= target
    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length -1;
        int mid  = end -(end - start)/2;

        if (nums[mid] == target){
            return mid;
        }

        while(start < end){
            if (nums[mid] > target){
                end = mid -1;
            }else if (nums[mid] < target){
                start = mid +1;
            }else{
                return start;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(arr,target));
    }

}
