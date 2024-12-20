package Java_DSA.Maths;

import java.util.ArrayList;

public class Maths_12 {

    public static void main(String[] args) {
        int n = 40;

//        for (int i = 2; i <= n; i++) {//running isPrime() n times
//            System.out.println(i + " " + isPrime(n));//total complexity will be O(n*sqrt(n))
//        }


//        boolean[] primes = new boolean[n+1];
//        Sieve2(n,primes);

        //Question 3
        int aa = 19;
//        int precision = 19;
        int precision = 15;//atmost 15 digit accuracy which is still less than newton raphson method
//        System.out.println(sqrt(aa,precision));
        //space complexity -> O(n)

        //Question 4
//        - Newton Raphson method
//        time complexity -> O( (log n) * f(n) )
//        System.out.println(newtonSqrt(19));

        //Question 5 ->

//        int f1 = 25;
//        factor1(20);
//        factor2(20);
//        factor3(400);
        System.out.println(HCF(225, 105));
        System.out.println(LCM(225, 105));//LCM = 1575; i.e, 1575 is lowest No. that can be divided by 105 & 225

    }

    static int LCM(int a, int b) {
        return a * b / HCF(a, b);
    }

    static int HCF(int a, int b) {
        if (a == 0) {
            return b;
        }
        return HCF(b % a, a);

    }

    static void factor1(int n) { // complexity = O(n)
        for (int factors = 1; factors < n; factors++) {
            if (n % factors == 0) {
                System.out.printf("%d is a factor of %d\n", factors, n);
            }
        }
    }

    static void factor2(int n) { // time Complexity = O(sqrt(n)) and space complexity = O(1)
        for (int i = 1; i < Math.sqrt(n); i++) {//By limiting it to its sqrt, prevents repeating numbers
            //But the answer might be unsorted and like, 1, 20, 2, 10, 4,5
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                }
                System.out.print(i + " " + n / i);
            }
        }
    }

    static void factor3(int n) {//Sorted but also stores numbers in auxiliary space, increase space complexity
        ArrayList<Integer> space = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    space.add((n / i));
                }
            }
        }
        //Above loop, storing and print numbers till sqrt(n), while also storing term multiplied term to list space
        //Below
        for (int i = space.size() - 1; i >= 0; i--) {
            System.out.print(space.get(i) + " ");

        }
    }

    static double newtonSqrt(double n) {//for n = 19
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));// root = 10 then 5.95 then x being even lower root= 4.571638655....
            if (Math.abs(root - x) < 0.5) {// and then difference being lesser than 0.5 i.e, error < 0.5
                break;//break the loop and rey=turn root.
            }
            x = root;//x == root i.e, very small number
        }
        return root;
    }

    static double sqrt(int n, int p) {
        double root = 0.0;
        int s = 0;
        int e = n;//since, sqrt will obviously lesser than number n

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }//Above loop is simple BS then, we gotta add precision to it with increasing it by 0.1 then 0.01

        double increment = 0.1;//
        for (int i = 0; i < p; i++) {
            //loop only runs when sqrt is in decimals, not for sqrt(16) = 4;
            while (root * root <= n) {
                root += increment;
            }//if precision is high then, loops runs many times in which it root might be higher by some decimal than answer
            root -= increment;
            increment /= 10;
        }

        return root;
    }

    //False in array means no. is prime
    static void Sieve(int n, boolean[] primes) {
        int i = 2, j = i * 2;
        do {

            if (!primes[i]) {
                while (j <= n) {
                    primes[j] = true;
                    j += i;

                }
            }

        } while (i <= n);

        for (int k = 0; k <= n; k++) {
            if (!primes[k]) {
                System.out.println(i + " ");
            }

        }

    }

    static void Sieve2(int n, boolean[] primes) {
        int i = 2;
        do {//Initially all numbers are false and false are classifies as prime in code.

            if (!primes[i]) {//assigning primes as !primes i.e, false
                //int j is multiple of 2 of that number and if greater than limit then ignore
                //if not, then let that no. be true and add i to j
//                E.g - in int i=3, j=6 so i=3 will be prime and j =6 = j+i=6+3=9 then, again in loop
//                j=
                int j = i * 2;
                while (j <= n) {
                    primes[j] = true;
                    j += i;
                }
            }
            i++;
        } while (i <= n);

        for (int k = 2; k <= n; k++) {
            if (!primes[k]) {
                System.out.print(k + " ");
            }
        }
    }


    static boolean isPrime(int n) {//This have complexity of O(sqrt(n))
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}

