package ques.week7;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {

    int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));


    }

    static int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums){
            result ^= num;
        }
        return result;
    }

    static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums){
            if (!set.add(n)){
                set.remove(n);
            }
        }
       return set.iterator().next();
    }

}
