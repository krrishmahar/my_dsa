package Java_DSA.OOPs.Polymorphism;

import java.util.Arrays;

public class Triangle extends Shapes {

    @Override
    void area() {
        System.out.println("Area = s((s-a)(s-b)(s-c))");
    }

    void area(int nums, String str) {
        System.out.println(nums + toAscii(str));
    }

    void area(String str, int nums) {
        System.out.println(str + nums);

    }

    static int toAscii(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sum += (int) c;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(toAscii("Krrish"));
    }
}
