package ques.week1;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] nums = {'x','x','y','y'};
        System.out.println(nextGreatestLetter(nums,'z'));
    }


    static char nextGreatestLetter(char[] letters, char target) {
        return BS(letters, target);
    }

    private static char BS(char[] nums, char target) {
        int start=0, end = nums.length -1;

        while (start <= end){
            int mid = start - (start - end)/2;
            if (nums[mid] > target) {
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return nums[start % nums.length];
    }

}
