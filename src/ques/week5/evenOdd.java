package ques.week5;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println(isEven(19));
    }
    static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
