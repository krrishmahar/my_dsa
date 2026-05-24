package practice.binSearch;

public class binarySearch {
    static void main() {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
        int ans = binarySearch(nums,5);
        int ans2 = binSearchRecursive(nums,6);
        System.out.println(ans);
        System.out.println(ans2);

    }

    static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0)   return -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;  //Not (high+low)/2 or high + (low-high)/2   to avoid int overflow
            if (nums[mid] < target) {
                low =  mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binSearchRecursive(int[] nums, int target) {
        if (nums == null || nums.length == 0)   return -1;

        return binSearchRecursive(nums, target, 0, nums.length-1);
    }
    static int binSearchRecursive(int[] nums, int target, int low, int high) {
        int mid = low + (high-low)/2;
        if (nums[mid] == target) {
            return mid; //base condition
        } else if (nums[mid] > target) {
            return binSearchRecursive(nums, target, low, mid-1);
        }
        return binSearchRecursive(nums, target, mid+1, high);
    }
}
