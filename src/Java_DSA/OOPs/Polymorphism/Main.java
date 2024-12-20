package Java_DSA.OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();


//        square.area();

//        Inheritance is also a type of polymorphism
//        poly-> Many  morphism-> ways to represent

//        Types of polymorphism:
//        1. Compile time / Static polymorphism e.g: Multiple constructor
//              ->achieved by method overloading and operator overloading too
//              //but Java doesn't support operator overloading
//              Overloading is seen when two meth of same name takes different param
//      e.g:
        Triangle triangle = new Triangle();
//        triangle.area();
//        triangle.area(11,"Krrish");
//        triangle.area("Krrish",11);


//        2. Runtime / Dynamic polymorphism
//              ->achieved by method over-riding
//              Overriding is seen when two meth has different body
//        Overriding in Detail:
//              when parent/super reference calls the type of child; known as Upcasting
        Shapes obj = new Circle();
        obj.area();

//        Implementation of Runtime polymorphism is done by Dynamic Method Dispatch
//      [parent] defines {accessible meth} and [child] determines which {meth to override}

//       which overridden meth to be called is determine at runtime via Dynamic Method dispatch
//      use final to prevent inheritance or overriding via late binding
//     IMP:  refer to note of early binding and late binding :
//         https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/lectures/17-oop/notes

    }
}

