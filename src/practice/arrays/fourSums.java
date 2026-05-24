package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSums {

    static List<List<Integer>> foursums(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length-3; i++) {

                //check for duplicated i
                if (i>0 && nums[i] == nums[i-1]) continue;

                for (int j = i+1; j< nums.length -2; j++) {
                    //check for duplicated j
                    if (j > i+1 && nums[j] == nums[j-1]) continue;

                    int left = j+1;
                    int right = nums.length-1;

                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            //check duplicates
                            while (left < right && nums[left] == nums[left+1])  left++;
                            while (left < right && nums[right] == nums[right-1])  right--;

                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }

            return res;
    }

    static void main() {
        int[] nums1 = new int[] {-2,-1,0,0,1,2};
        int[] nums2 = new int[] {2,2,2,2,2,2};
        List<List<Integer>> res2 = foursums(nums1, 0);

        for (List<Integer> num : res2) {
            System.out.print(num.toString() + " ");
        }
    }
}
