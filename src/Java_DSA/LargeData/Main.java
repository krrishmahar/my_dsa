package Java_DSA.LargeData;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    static void BI(){
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(6230265);
        BigInteger B = new BigInteger("48498545613845123985123461");
        BigInteger B2 = new BigInteger("6125996994561356369966985123461");
        BigInteger C = BigInteger.ZERO;

        int x = B.add(B2).intValue();
        BigInteger m = B2.multiply(B);
//        System.out.println(x);
//        System.out.println(m);

        System.out.println(Factorial.fact(119));

    }

    static void BD(){
        double x = 0.03, y = 0.04;
        double ans = y-x;
        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03"), Y = new BigDecimal("0.04");
        BigDecimal ANS = Y.subtract(X);
        System.out.println(ANS);

        BigDecimal a = new BigDecimal("4652359652.65325323");
        BigDecimal b = new BigDecimal("4512134452.1999999999994152");
        BigDecimal c = a.multiply(b);
        System.out.println(c.pow(2).negate()); //negate() gives -ve val like x -> -x

        //constants
        BigDecimal cons = BigDecimal.ZERO;
    }


    public static void main(String[] args) {
    BD();
    }
}
