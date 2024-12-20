package ques.week6;

public class magicNum {
    public static void main(String[] args) {
    // nth magic number question of Amazon
//        https://leetcode.com/problems/nth-magical-number/description/
        int val = magic(5);
        System.out.println(val);
    }

    static int magic(int n) {
        int pow = 1, answer = 0;

        // Go through every bit of n
        while (n> 0)
        {
            pow = pow*5;

            // If last bit of n is set
            if ((n & 1) == 1)
                answer += pow;

            // proceed to next bit
            n >>= 1;  // or n = n/2
        }
        return answer;
    }

}
