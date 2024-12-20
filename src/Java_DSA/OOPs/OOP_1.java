package Java_DSA.OOPs;

import java.util.Arrays;

public class OOP_1 {

    static class Student {
        int id;
        String name;
        float marks;

        void greeting() {
            System.out.println("Hello! " + name);
        }

        //        Now, Student class can be used with 3 different way i.e, with no param, 1 param, 3 param and 1 special way
        Student(int marks) {
            this.id = 11;
        }
//        Special way: using another object to instantiate var of another obj

        Student(Student other) {
            this.name = other.name;
            this.id = other.id;
            this.marks = other.marks;
        }

        //       calling default values via constructor like Java usecase
       /*       Student() { //this acts as default constructor
               this.id = 19;
               this.marks = 92.04f;
               this.name = "Krrish";
               }
               Or       */
        Student() {
            this(null, 0, 0);
        }

        Student(String name, int id, float mark) {
            this.marks = mark;
            this.name = name;
            this.id = id;
        }

        void changeName(String name) {
            this.name = name;
        }

        void details() {
            System.out.printf("Name: %s, id: %d, marks: %f  ", this.name, this.id, this.marks);
        }
    }

    public static void main(String[] args) {
//    Classes are not garbage collected because they are part of the program's codebase and are loaded into memory by the Java Virtual Machine (JVM) when needed.
//    Classes remain in memory for the duration of the program's execution, regardless of whether they are instantiated or used.
//        When you declare an object of a class, you are creating an instance of that class.
//        Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)

//        refer to: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/classes.txt

//        float[] arr = new float[5];
//        System.out.println(Arrays.toString(arr));
/*        The dot operator links the name of the object with the name of an instance variable.
        Although commonly referred to as the dot operator, the formal specification for Java categorizes the ( . ) as a separator.*/
//        The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it.
//            This reference is, more or less, the address in memory of the object allocated by new.
//            This reference is then stored in the variable.
//            Thus, in Java, all class objects must be dynamically allocated.

//        Student student = new Student();
//   at  { compile time }   { run time }
//        compile time: time taken to check errors, exception, semicolons, etc.
//        run time: running time of program in which it allocates memory -> dynamic memory allocation -> logical errors

//        new keyword -> Dynamic memory allocation
//        Constructor: a special type of function that allocate/instantiate values to variable/instance
//        Java allocates 0, null, 0.0 values by default construction which is modified by us.
//        Student student = new Student();
//        student.id = 19;
//        student.marks = 92.04f; //this can be predefined in class by 'this' keyword
//        'this' keyword replaces the default parameter to parameter of each object
//        student.greeting();
//        student.changeName("Yash");
//        student.greeting();
        Student nobody = new Student("Noone", 10, 90);

        Student random = new Student(nobody);
        Student random2 = new Student();
//        random.details();
//        random2.details();

//        Note:
//        We can't use this keyword to create primitive datatype since they are not object that are stored in heap memory
//        In java, primitives are implemented as normal variables not as objs, cuz if ya were inputting obj in obj(array)
//        It would be very slow that obj pointing obj in heap hence, inefficient and slow
//        therefore, python is slow language since everything in it is obj

//        pointing value of another variable doesn't allocate auxiliary memory
//        this is memory allocation by this keyword.
        Student one = new Student();
        Student two = one;
        one.name = "Dumb";
        one.id = 101;
        one.details();
        System.out.println();
        two.details();

    }
}
