package Java_DSA.OOPs.Singleton;

import Java_DSA.OOPs.accessModifier.A;

public class Main {
    public static void main(String[] args) {

        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        //ALl 3 ref var are pointing to one obj

//        obj1.single("krrish");
        System.out.println(obj1.ret(11, 19));

        System.out.println(obj1);
        System.out.println(obj2);

        A a = new A(11, "krrish");
        a.getNum();
    }
}
