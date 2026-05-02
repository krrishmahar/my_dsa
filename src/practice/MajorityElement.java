package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int majorityElement(int[] nums) {
    int curr = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == curr)    count++;
        else count--;

        if (count == 0) { //false
            curr = nums[i];
            count = 1;
        }
    }
    return curr;
    }

    static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length/2);
        for (int i = 0; i< nums.length; i++) {
            if (map.containsKey(nums[i])) map.replace(nums[i], map.get(nums[i]) + 1);
        }
return -1;
    }

    static void main() {
        int[] nums = new int[] {1,1,1,1,4,3,2,1,4};
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));
    }
}
