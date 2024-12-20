package ques.week5;

public class isUnique {
    public static void main(String[] args) {
        int[] ques2 = {2, 3, 6,6, 1, 4, 2, 3};
        System.out.println(unique(ques2));
    }

    static int unique(int[] n){
        int unique = 0;
        for (int nn : n){
            unique ^= nn;
        }
        return unique;
    }
}
