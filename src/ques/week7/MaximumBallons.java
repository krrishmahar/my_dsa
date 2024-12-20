package ques.week7;

public class MaximumBallons {

    public static void main(String[] args) {

        int ans = maxNumberOfBalloons("leetcode");
        System.out.println(ans);

    }

    public static int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for (char c : text.toCharArray()){
            count[c - 'a']++;
        }
        return Math.min(count[1], Math.min(count[0], Math.min(count[11]/2, Math.min(count[14]/2, count[13]))));
    }

}
