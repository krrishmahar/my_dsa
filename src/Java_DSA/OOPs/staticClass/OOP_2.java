package Java_DSA.OOPs.staticClass;

import Java_DSA.OOPs.Human;

public class OOP_2 {

    public static void main(String[] args) {
//        since we generally create obj of any class then use it via that reference name
//        here, in main func(),main() is the first thing running hence it should be static to be run independent of any obj

//        System.out.println("any function from same dir can be called by writing its name then pressing Alt+Enter via import ");
//        System.out.println("Only applicable if meth is public");
//         message();

//         Human obj1 = new Human(16,15000,"Krrish",false);
//         Human obj2 = new Human(18,19000,"yash",false);
//         Human obj3 = new Human(51,105000,"Shete",true);

//         Both way gives correct answer but conventional way is to call class instance population via class Human
//        System.out.println(obj1.population); //will give error if no such obj is created
        System.out.println(Human.population);
//        static basically helps to run the class without creating a prior object
//        static method only access static data
//        reason: since, non-static things belong to instance(obj) who know when obj is deleted or modified
    }

    static void func() {
//        message();//can't access it since it requires instance
//        Main.message(); //still cannot
//        logic that static obj are independent of instance using something that requires an instance is illogical

//        To resolve it:
//        1. we can make that func() static
//        2. Create an instance obj and refer func() through it
        OOP_2 obj = new OOP_2();
        obj.message();

//        static func() cannot use this keyword to refer an obj or super keyword to refer the parent class's obj

    }

    void message() {
//        func(); works well
        System.out.println("Hello World");
    }

}
