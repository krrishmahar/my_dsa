package ques.week1;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(floor(nums,2));
    }

    //using order agnostic binary search to find floor
    static int floor(int[] nums, int target){

        try {
            return OrderAgnosticBS(nums, target);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is empty");;
        }
    return Integer.MIN_VALUE;
    }

    private static int OrderAgnosticBS(int[] nums, int target) {
        int start=0, end = nums.length -1;
        boolean isAsc = nums[start] < nums[end];

        while (start <= end){
            int mid = start - (start - end)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (isAsc){
                if (nums[mid] > target) {
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }else {
                if (nums[mid] > target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }

        //Defining factor for Floor just reverse end and start to get ceiling
        if (isAsc){
            return end;
        }else {
            return start;
        }
    }
}
