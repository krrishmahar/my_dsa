package practice.binSearch;

public class orderAgnostic {

    static int orderAgnosticBS(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target)    return mid;
            if (nums[start] < nums[end]) {
                if (nums[mid] > target) {
                    //[1,2,3,4,5,6,7,8,9,10] 7;
                    end = mid-1;
                } else if (nums[mid] < target) {
                    start = mid+1;
                }
            } else {
                if (nums[mid] > target) {
//                   [10,9,8,7,6,5,4,3,2,1] 7
                    start = mid+1;
                } else if (nums[mid] < target) {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    static void main() {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {9,8,7,6,5,4,3,2,1};
        int ans = orderAgnosticBS(nums,3);
        int ans2 = orderAgnosticBS(nums2,3);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
