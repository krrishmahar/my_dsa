package krrishna.arrays;

public class maxDifference {

    static int maxDiff(int[] nums){
        if (nums.length == 0) return -1;
        int DIFF = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int newDIFF = (nums[i] - nums[j]);
                if (newDIFF > DIFF){
                    return newDIFF;
                }
            }
        }
        return -1;
    }

    static int optimMaxDiff(int[] nums){
        if (nums.length == 0) return -1;
        int BIGNO = Integer.MIN_VALUE;
        int SMALLNO = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> BIGNO){
                BIGNO = nums[i];
            }
            if (nums[i]< SMALLNO){
                SMALLNO = nums[i];
            }
        }
        return BIGNO - SMALLNO;
    }

    static int maxDiffOptimal(int[] arr){
        int min = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;
            maxDiff = Math.max(maxDiff, diff);

            min = Math.min(min, arr[i]);
        }
        return maxDiff;
    }

    static void main() {
        int[] arr = {7,1,5,3,6,4};
//        System.out.println(maxDiff(arr));
//        System.out.println(optimMaxDiff(arr));
        System.out.println(maxDiffOptimal(arr));
    }
}
