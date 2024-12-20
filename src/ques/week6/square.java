package ques.week6;

public class square {
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

}
