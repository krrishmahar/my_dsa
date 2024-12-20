package ques.week1;

public class EvenDigits {
//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1286119615/

    class Solution {

        static int evenNum(int num){
            int count=0;
            while (num != 0){
                num /= 10;
                count++;
            }
            return count;
        }

        static int findNumbers(int[] nums) {
            int count = 0;

            for (int num: nums){
                int temp = evenNum(num);
                if (temp%2 == 0){
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {

    }

    //second way:
    static int digits2(int num){
        if (num < 0){
            num *= -1;
        }
        return ((int) Math.log10(num)-1 );
    }

    static int findNumbers2(int[] nums) {
        int count = 0;
        for (int num: nums){
            if (digits2(num) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //Direct way:
    static int ans3(int[] nums){
    int count = 0;
        for (int num: nums){
            if (num <0) num *= -1;
            if ( (int) (Math.log10(num)) % 2 == 0 ) count++;
        }
        return count;
    }


}
