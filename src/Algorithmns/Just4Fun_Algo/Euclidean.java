package Algorithmns.Just4Fun_Algo;


public class Euclidean {

    static int EuclideanAlgo(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        int ans = EuclideanAlgo(25, 225);
        System.out.println(ans);
    }

}
