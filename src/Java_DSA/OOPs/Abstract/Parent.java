package Java_DSA.OOPs.Abstract;

//This is an Abstract class
//Abstract classes also doesn't support multiple inheritance, only interfaces does.
public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age, int val) {
        this.age = age;
        this.VALUE = val;
    }

    public Parent(int age) {
        this.age = age;
        VALUE = 163205213;
    }

//     abstract static meth(){
//        //lol, this cannot be done since, abstract meth must be overridden but static meth cannot be overridden
//    }

    //     final abstract meth(){
//        //this cannot be done since, abstract meth must be overridden but final meth cannot be inherited.
//    }
    void normal() {
        System.out.println("Abstract class supports Normal as well as Static methods");
    }

    static void hello() {
        System.out.println("hey");
    }

    abstract void career();

    abstract void partner();
}
