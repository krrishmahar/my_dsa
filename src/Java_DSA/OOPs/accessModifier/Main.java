package Java_DSA.OOPs.accessModifier;

import Java_DSA.OOPs.Singleton.SubClass;

public class Main {

    A obj = new A(10, "Krrish");

/*
                │ Class │ Package │ Subclass │ Subclass │ World
                │       │         │(same pkg)│(diff pkg)│(diff pkg & not subclass)
            ────────────┼─────────┼──────────┼──────────┼──────────┼──────────────────────────
    public      │   +   │    +    │    +     │     +    │   +
            ────────────┼─────────┼──────────┼──────────┼──────────┼──────────────────────────
    protected   │   +   │    +    │    +     │     +    │
            ────────────┼─────────┼──────────┼──────────┼──────────┼──────────────────────────
    default     │   +   │    +    │    +     │          │
            ────────────┼─────────┼──────────┼──────────┼──────────┼──────────────────────────
    private     │   +   │         │          │          │

    //Only Subclass can access protected instances
    + : accessible
    blank : not accessible
*/


    public static void main(String[] args) {
        System.out.println("hello");
    }

}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(11, "krrish");
        SubClass obj2 = new SubClass(11, "krrish");

//        int n = obj.num;
        int m = obj2.num;
        System.out.println("hola");

//        notes: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/access_control.txt

//        package notes: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/packages.txt

    }
}