package Java_DSA.OOPs.inheritance;


public class OOP_3 {
    //    https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/inheritance.txt
    public static void main(String[] args) {

//        Box box = new Box(4.5,5.5,40.2);
//        Box box2 = new Box(box);

//        System.out.println(box.l + " " + box.w+" "+ box.h );

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(4, 6, 9, 8);
//        System.out.println(box3.h + " " + box3. weight);
//        System.out.println(box3.l + " " + box3. weight);
        //Although a subclass can inherit its superclass, it cannot access its private

//      box5 is a reference var which will point to BoxWeight obj in heap
        Box box5 = new BoxWeight(4, 6, 9, 8);
//    (superclass)     (subclass)
//        What can be accessed depends upon type of identifier or reference var,not obj type;
//        System.out.println(box5.w);

        Box obj = new BoxWeight(5, 14, 5, 1);
//        System.out.println(obj.radius);

//        BoxWeight box6 = new Box(4,69,8);
// A child obj is initialized as Parent obj but only Parent var/constructor can be accessed
// but child obj has its own constructor which takes weight var but, parent has no weight var
// So, it gives error

//        Super keyword:
//        It calls various constructors from one level above class
//        parent -> child -> grandchild; super in each class will call its parent class


//  Types of Inheritance:
//      ~Single Inheritance
//      ~Multiple Inheritance:
//          If two or more parent has same var called in child class, there will be ambiguity which ti pick
//          hence, Multiple Inheritance is not supported in Java. Usually implemented via Interfaces
//      ~Hierarchical Inheritance: one parent is inherited by multiple child.
//      ~Hybrid Inheritance: Combination of single and multiple inheritance -> Not in Java-> implemented via Interfaces

//        Static methods can be inherited but cannot be overridden.
//        Overriding depend on Object but static stuff is independent to Object hence, Dynamic method dispatch won't happen if static
        Box box = new BoxWeight();
        box.greeting();
//      Instance var also cannot be overridden


    }


}
