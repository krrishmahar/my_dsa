package ques.week2;

public class countRotation {

    public static void main(String[] args) {
        int[] nums = {3,3,0,1,2,3};
        System.out.println(countRotations(nums));
    }
    private static int countRotations(int[] nums){
        return duplicateCount(nums) + 1;
    }

    static int duplicateCount(int[] nums){
        int start =0, end = nums.length -1;

        while (start <= end){
            int mid = start - (start - end)/2;
            if (mid > start && nums[mid] > nums[mid+1]) return mid;
            if (mid < end && nums[mid-1] > nums[mid])   return mid -1;
            if (nums[start] >= nums[mid]) end = mid - 1;
            else start = mid+1;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                if (nums[start] > nums[start+1]) return start;
                start++;
                if (nums[end] < nums[end-1])    return end-1;
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[end] && nums[mid] > nums[end]) ) {
                start = mid +1;
            } else {
                end = mid- 1;
            }
        }
        return -1;
    }
}
