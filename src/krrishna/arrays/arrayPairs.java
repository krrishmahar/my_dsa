package krrishna.arrays;

class NumsPair {
    int var1;
    int var2;
}

public class arrayPairs {

    static void getUniquePair(int[] nums){
        if (nums.length == 0) {
            System.out.println("Array is Empty!!");
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                System.out.printf("(" + curr + "," + nums[j] + ") ");
            }
            System.out.println();
        }
    }

    //two pointer approach
    static void getOptimizedUniquePair(int[] nums){
        int i=0, j= i+1;
        if (nums.length == 0) {
            System.out.println("Array is Empty!!");
        }
    }


    static void main() {
    int[] nums = {2,4,6,8,10};
    getUniquePair(nums);
    }
}
