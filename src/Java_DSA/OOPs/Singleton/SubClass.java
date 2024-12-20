package Java_DSA.OOPs.Singleton;

import Java_DSA.OOPs.accessModifier.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(11, "krrish");
        SubClass obj2 = new SubClass(11, "krrish");

//        int n = obj.num;
        int m = obj2.num;

    }

}
