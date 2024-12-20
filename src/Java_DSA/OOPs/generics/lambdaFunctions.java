package Java_DSA.OOPs.generics;

import Java_DSA.OOPs.accessModifier.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class lambdaFunctions {

    public static void main(String[] args) {

//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//
//            arr.add(i+1);
//        }

//        arr.forEach((item) -> System.out.println(item*2));
////      OR
//        Consumer<Integer> fun = (item) -> System.out.println(item*2);
//        arr.forEach(fun);

        Operation sum = Integer::sum;
        Operation subs = (a, b) -> a - b;
        Operation mul = (c, d) -> c * d;
        Operation div = (item1, item2) -> item1 / item2;

        lambdaFunctions myCalci = new lambdaFunctions();
        System.out.println(myCalci.operate(5, 6, sum));
        System.out.println(myCalci.operate(5, 6, subs));
        System.out.println(myCalci.operate(5, 6, mul));
        System.out.println(myCalci.operate(5, 6, div));

        System.out.println(sum);
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    //    int sum(int a, int b){
//        return a+b;
//    }
    interface Operation {
        int operation(int a, int b);
    }
}
