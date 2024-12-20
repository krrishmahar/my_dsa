package Java_DSA.OOPs.staticClass;

public class WrapperClass {

    static class A {
        //        if class is final, ya con't access it's anything var, instance, obj, etc
        String name = "krrish";

        public A(String name) {
            this.name = name;
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        int a = 19;
        int b = 11;
//        swap(a,b);
//        System.out.println(a+" "+b);

        Integer num1 = 19;
        Integer num2 = 11;
//        this is a wrapper class that create an int value as an obj providing many func/features
//        swapInt(num1,num2);
//        System.out.println(num1+" "+num2);
//        now, swapping is done with Integer, swap doesn't happen reference var cuz Integer is a final class too

//        final keyword:
//        (if there is final keyword, convention is that it is capital)
//        always initialize while declaring it since it is immutable
        final int count = 3;// all below eg gives error
//            count++;//            --count;//            count = 11;
//        final int[] arr = {1,2,3,4,5};
//        arr = new int[]{6, 7, 8, 9, 10};

//        this immutability is only limited to primitives not objects from class only.
        final A obj = new A("krrish");
        obj.name = "Mahar Krrish"; //this is OK
//        obj = new A("Yash"); //I can still change any non-final instance but, not constructor`
//        obj.name = "Minde yash";


//      Garbage collection:
//


//
    }

    static void swap(int a, int b) {
        System.out.printf("%d <-> %d\nswapping...\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("%d <-> %d\n", a, b);
    }

    static void swapInt(Integer a, Integer b) {
        System.out.printf("%d <-> %d\nswapping...\n", a, b);
        Integer temp = a;
        a = b;
        b = temp;
        System.out.printf("%d <-> %d\n", a, b);
    }

}
