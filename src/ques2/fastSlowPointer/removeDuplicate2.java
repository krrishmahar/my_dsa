package ques2.fastSlowPointer;

import java.util.Arrays;

public class removeDuplicate2 {
    static int removeDup2(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int occur=1,i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
                occur=1;
            }else {
                occur++;
                if (occur==2){
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }

    public static void main(String[] args) {
    int[] nums = {1,1,1,2,2,3};
    System.out.println(removeDup2(nums));
    }
}
