package ques.week2;

public class PositionInSortedInfinteArray {

//    leetcode : https://leetcode.com/discuss/interview-experience/1979273/infinite-sorted-array

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9,11,13,15,16,17,19};
        System.out.println(ans(nums,7));

    }

    static int ans(int[] nums, int target){
        int start =0, end = 1;
        int ans = -1;
        try {
            while (target > nums[end]){
                int newstart = end + 1;
                end = end + (end - start + 1)*2 ;
                start = newstart;
            }
        } catch (Exception e) {
            return -1;
//            throw new ArrayIndexOutOfBoundsException("Target does not lies in the array");
        }
        ans = BS(nums,target,start,end);
        return ans;
    }

    static int BS(int[] nums,int target,int start, int end){
        while (start <= end){
            int mid  = start - (start - end)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }

}
