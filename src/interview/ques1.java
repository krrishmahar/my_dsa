package interview;

public class ques1 {

// Brute Force
    static void main() {
    char[] input = {'W','L','G','W','L','L','W'};
//    output = {'W','W','W','L','L','W'};
//        char[] ans = new char[input.length-1];
        int countW = 0;
        int maxStreak = 0;
        int[] ans = new int[input.length-1];
        int i =0;
        while (input[i] != 'G' && input[i] != 'L' ){
            ans[i] = 1;
            i++;
        }
        int j=0;
        while (j < input.length-1) {
            if (input[i] == 'W') countW++;
            j++;
        }
    }
}
