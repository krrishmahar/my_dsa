package ques.week4;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    static int fibo(int n){
        return n<2 ? n: fibo(n-1) + fibo(n-2);
    }
}
