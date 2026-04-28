package practice;

import java.util.Arrays;

public class sortColors {
        static void sortColors(int[] nums) {
            //Nested loop method -> O(n2) Time
            for (int i=0; i<nums.length; i++){
                for (int j=i+1; j<nums.length; j++){
                    if (nums[j]<nums[i]){
                        //swap()
                        int temp = nums[i];
                        nums[i]  = nums[j];
                        nums[j]  = temp;
                    }
                }
            }
        }

        static void sortColorsOptim(int[] nums) {
            //Partition method or Dutch Flag method with O(n) Time
            int low = 0, mid = 0, high = nums.length-1;
            while (mid <= high){
                if (nums[mid] == 0){
                    //swap mid with low
                    int temp  = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    ++low;
                    ++mid;
                } else if (nums[mid] == 1){
                    ++mid;
                } else {
                    //swap mid with high
                    int temp   = nums[high];
                    nums[high] = nums[mid];
                    nums[mid]  = temp;
                    --high;
                }
            }
        }


    static void main() {
        int[] nums = {
            2, 0, 2, 1, 1, 0
        };
//        sortColors(nums);
//        Arrays.sort(nums);
        sortColorsOptim(nums);
        System.out.println(Arrays.toString(nums));
    }
}
