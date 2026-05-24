package practice;

public class maxProdSubarray {

    //Not Kadane Algo -> maximum-product-subarray
    //logic -> take max, min and ans
    //swap max and min when nums[i] or next < 0 i.e, negative
    static int maxProduct(int[] nums){
        if (nums.length == 1)   return nums[0];
        else if (nums.length == 0)   return -1;
        int max = nums[0], min = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            ans = Math.max(ans, max);

        }
        return ans;
    }

    static void main() {
        int[] nums = new int[]{-2};
        int[] nums2 = new int[]{2,3,-2,4};
        int[] nums3 = new int[]{2,-5,-2,-4,3};
        System.out.println(maxProduct(nums3));
    }
}
