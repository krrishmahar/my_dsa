package practice.oops;

import java.io.IOException;

public class Throwing {
    static void main() {
        int ans=0;
        try {
            ans = divide(11,0);
        } catch (Exception e){
//            System.out.println();
            e.printStackTrace();
        } finally {
            System.out.println(ans);
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

}

interface notDivide {
    default int divide (int a, int b){
        return a/b;
    }
    default int divide2(int a, int b){
        return a/b;
    }

}

abstract class A {
    abstract int divide(int a, int b) throws Exception;
}

class B extends A {
    @Override
    int divide(int a, int b){
        return a/b;
    }
}
