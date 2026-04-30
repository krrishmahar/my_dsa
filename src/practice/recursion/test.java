package practice.recursion;

public class test {
    static void printHello(int n){
        if (n > 200000)  return;
        printHello(n+1);
    }

    static int fiboGoldenRatio(int n){
        return (int) (Math.pow(1.6180339887, n));
//        return (int) ((Math.pow((1 + Math.sqrt(5) / 2), n)) / Math.sqrt(5));

    }

    static long fiboGoldenRatio2(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }

    static int fiboRecursion(int n){
        if (n < 2)  return n;
        return fiboRecursion(n-1) + fiboRecursion(n-2);
    }
    static void main() {
//        System.out.println(fiboGoldenRatio(25));
        System.out.println(fiboGoldenRatio2(25));
        System.out.println(fiboRecursion(25));

    }
}
