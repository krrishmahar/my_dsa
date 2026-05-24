package practice;

import java.util.*;

public class threeSums {

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int curr = nums[0];
        for (int i = 1; i< nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                List<Integer> temp;
                temp = Arrays.asList(curr, nums[i], nums[j]);
                Collections.sort(temp);
                if ((nums[i] + nums[j] + curr) == 0 && !res.contains(temp))
//                    res.add(new ArrayList<>(List.of(curr, nums[i],nums[j])));
                    res.add(temp);
            }
        }
        return res;
    }

    static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length -2; i++) {

            //Skip duplicate values by i
            if (i>0 && nums[i] == nums[i-1])  continue;

            int left = i+1, right = nums.length-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                //3 conditions
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[left], nums[right]));

                    //Check for duplicates
                    while (left < right && nums[left] == nums[left+1])  left++;

                    while (left < right && nums[right] == nums[right-1])  right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    static void main() {

    int[] nums = new int[] {-1,0,1,2,-1,-4};
    int[] nums2 = new int[] {-1,0,1,2,-1,-4};
//    List<List<Integer>> res = threeSum(nums);
    List<List<Integer>> res2 = threeSum2(nums);

    for (List<Integer> num : res2) {
        System.out.println(num.toString());
    }
    }
}
