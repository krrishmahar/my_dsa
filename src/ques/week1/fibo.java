package ques.week1;

public class fibo {

    public static void main(String[] args) {
//fibo1(10);
        int ans = fibo2(10);
//        System.out.println(ans);
        System.out.println(fibo2(10));
    }

    static int fibo2(int x){
        if (x <=1){
            return x ;
        }
        return fibo2(x-1) + fibo2(x-2);
    }

    static void fibo1(int x){
        int n1=0,n2=1;
        int n3;
        for (int i = 2;i <x;++i){
            n3= n1+n2;
            System.out.print(n3+ " ");
            n1 = n2;
            n2 = n3;
        }
    }



}
