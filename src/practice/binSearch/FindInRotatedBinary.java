package practice.binSearch;

public class FindInRotatedBinary {

    static int findPivot(int[] nums) {
        int s=0, e= nums.length-1;
        while (s<e) {
            int mid = s + (e-s)/2;
            if (mid < e && nums[mid] > nums[mid+1])
                return mid;
            if (mid > s && nums[mid] < nums[mid-1])
                return mid-1;
            if (nums[mid] <= nums[s]) {
                e = mid-1;

            } else {
                s = mid;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,0};
        int[] arr2 = {4,5,6,7,0,1,2,3};
        int[] arr3 = {1,3};
        System.out.println(findPivot(arr1));
        System.out.println(findPivot(arr2));
        System.out.println(findPivot(arr3));
    }
}
