package krrishna.arrays;

import java.util.Arrays;

public class reverseArray {

    static void reverseArray(int[] nums){
        if (nums.length == 0)   return;
        int i=0, j = nums.length-1;
        while (i<j){
            swap(nums[i],nums[j]);
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
            ++i;
            --j;
        }
    }

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void main() {
        int[] nums = {2,4,6,8,10};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
