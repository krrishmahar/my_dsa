package Java_DSA.Recursion;

public class Recursion_13 {

    public static void main(String[] args) {
//Ques1(1);
//        System.out.println(Ques1(0));//gives error since Ques1() is void method
    /*    fun(5);
funRev(10);
funBoth(10);*/

//        System.out.println(factorial(25));
//        System.out.println(sumOfDigit(5132));
//        System.out.println(ProductOfDigit(292));
//Ques5(5);
//        System.out.println(ques7_1(130400));
//        ques7_1(10520);
//        System.out.println(1152040);
//        System.out.println(ques7_3(152201));
//        System.out.println(Palindrome(1551));

        //Ques 8 : Count no. of zero
        int no = countZero(1503000);
//        System.out.println(no);

        //Ques 9 : Count step to reduce a number into zero by dividing by 2 or subtracting by 1
        int step = (numOfSteps(1992));
        System.out.println(step);
    }

    static int numOfSteps(int num) {

        return helper9(num, 0);
    }

    private static int helper9(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper9(num / 2, steps + 1);//if even, divide by 2 and increase step by 1
        }
        return helper9(num - 1, steps + 1);//if odd, subtract by 1 and increase step by 1
    }

    static int countZero(int n) {//can be modified to count any number.
        return helperCount(n, 0);

    }

    //Special example to return same value to above call function
    private static int helperCount(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {//just change remainder to count whatever ya wanna count.
            return helperCount(n / 10, count + 1);
        }
        return helperCount(n / 10, count);
    }

    static boolean Palindrome(int n) {
        return (n == ques7_3(n));

    }

    static void ques7_2(int n) {//reverse a number recursively

        if (n == 0) {
            return;
        }
        int rem = n % 10;
        rev = rev * 10;
        ques7_2(n / 10);
    }

    static int ques7_3(int n) {
        //sometimes, you need another variable in the argument
        //in that case, use helper function
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            n /= 10;
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }


    static int rev = 0;

    static void ques7_1(int n) {
        //reverse a number iteratively
        if (n == 0) {
            return;
        }
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println(rev);
    }

    static void Ques5(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        Ques5(n--); //gives error since n-- calls 5 again then
        Ques5(--n);
    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + (n / 10);
    }

    static int ProductOfDigit(int n) {
        if (n % 10 == n) {
            return 0;
        }
        return (n % 10) * (n / 10);
    }

    static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static long Sum(long n) {
        if (n <= 1) {
            return 1;
        }
        return n + factorial(n - 1);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    static void Ques1(int n) {//print no. till 5
        if (n > 5) {
            return;
        }
        System.out.println(n);
        Ques1(n + 1);
        System.out.println(n);
    }

}
