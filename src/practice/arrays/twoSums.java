package practice;

import Java_DSA.OOPs.EnumExample.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution{
//    map -> int, int
    static int[] twoSumhashed(int[] nums, int target){
        Map<Integer,Integer> numsMap = HashMap.newHashMap(nums.length);
        for (int i : nums){
            numsMap.put(nums[i],i);
        }

        for (int s : nums){
            int compliment = target - numsMap.get(s);
            if (numsMap.containsKey(compliment))	return new int[] {s,numsMap.get(compliment)};
        }

        return new int[] {-1};
    }
}

public class twoSums {
    //Brute Force nested loops method
    //Not 2 pointer, it requires sorted array
        static int[] twoSum(int[] nums, int target) {
            for (int i =0; i < nums.length; i++ ){
                for (int j=i+1; j < nums.length; j++ ){
                    if (nums[i] + nums[j] == target)
                        return new int[]{i,j};
                }
            }
            return new int[]{-1};
        }

        //Optimized HashMap with time O(n) and space O(n)
    static int[] twoSums2(int[] nums, int target){
//            target = 9; // 9 - nums[i] = 9-3 = 6
//            3,4,5,1; -> [1,2]
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)){
                return new int[]{numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{-1};
    }

    static int[] twoSumHashed(int[] nums, int target){
        Map<Integer,Integer> numsMap = HashMap.newHashMap(nums.length);
        for (int i=0; i< nums.length; i++){
            int compliment = target - nums[i];
            if (numsMap.containsKey(compliment))
                return new int[] {numsMap.get(compliment),i};
            numsMap.put(nums[i],i);
        }

        return new int[] {-1};
    }

    static void main() {
            int[] nums = {3,2,4,1};
        ArrayList<Integer> list = new ArrayList<>(); // 10
        list.add(2); // 1
        list.add(4); // 2 ->
        list.add(5); // 4
        list.add(6); //
        list.add(7); // 8


//            int[] ans= twoSums2(nums, 6);
//        System.out.println(Arrays.toString(ans));
        System.out.println();

        int[] ans2 = twoSums2(nums, 6);
        System.out.println(Arrays.toString(ans2));

    }
}
