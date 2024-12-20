package ques.week4;

public class binaryS {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11};
        int ans = search(arr,11,0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] nums, int target, int s, int e){
        if (nums.length == 0)   return -1;
        if (s>e)    return -1;

        int mid = e - (e-s)/2;
        if (nums[mid] > target) return search(nums, target, s, mid-1);
        if (nums[mid] < target) return search(nums, target, mid+1, e);
        if (nums[mid] == target)return mid;

        return -1;
    }
}
