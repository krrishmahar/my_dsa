//package ques2.slidingWindow;
//
//import java.sql.Array;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class FirstNegNum {
//    static int[] firstNegNum(int[] nums, int k){
//        int[] ans = new int[nums.length- k +1];
//        Queue<Integer> ansList = new LinkedList<>();
//        int l=0, r=0;
//        int ptr=0;
//
//
//        //apply sliding window method
//        while (r<nums.length){
//
//            if (nums[r] < 0) ansList.add(nums[r]);
//
//            if (r - l + 1 < k){
//                r++;
//            } else if (r - l + 1 == k){
//                if (ansList.isEmpty())
//                    ansList.add();
//            }
//
//        }
//    return ansList;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, -1, -2, 8, -16, 30, 16, 28};
//        int k = 3;
//
//    }
//}
