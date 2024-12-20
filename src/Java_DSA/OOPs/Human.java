package Java_DSA.OOPs;

public class Human {
    int age, salary;
    String name;
    boolean married;
    public static int population; //static variables can be accessed or called without creating an obj
//    they are independent and can be called before any other object.value is allocated


    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
//        this.population +=1;// It if fine but not good since it only make changes in obj not class
        Human.population += 1;
    }
}
