package ques.week2;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(splitArray(nums,2));
    }


    static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }
        while (start < end){
            int mid = start - (start-end) /2;
            int sum=0, pieces = 1;
            for (int num : nums) {
                if (sum + num <= mid )	sum += num;
                else {
                    sum = num;
                    pieces++;
                }
            }
            if (pieces > k) start = mid +1;
            else end = mid;
        }
        return end;
    }


}
