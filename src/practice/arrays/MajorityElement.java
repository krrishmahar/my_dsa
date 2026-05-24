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


    static void main() {
        int[] nums = new int[] {1,1,1,1,4,3,2,1,4};
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));
    }
}
