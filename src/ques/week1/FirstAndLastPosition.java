package ques.week1;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
        System.out.println(Arrays.toString(searchRange(nums, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
    }

// First and Last Occurrence in sorted array


    static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        if (ans[0] != -1){// answer is not null
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean isStartIndex){

        int s1 = 0, e1 = nums.length - 1;
        int ans = -1;

        while (s1 <= e1) {
            int mid = e1 - (e1 - s1) / 2;
            if (nums[mid] > target) {
                e1 = mid - 1;
            } else if (nums[mid] < target){
                s1 = mid + 1;
            }else {
                ans = mid;
                if (isStartIndex){
                    e1 = mid -1;
                }else {
                    s1 = mid + 1;
                }
            }
        }
        return ans;
    }



}
