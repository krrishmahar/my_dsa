package Java_DSA.OOPs.Abstract;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be a Doctor.");
    }

    @Override
    void partner() {
        System.out.println("I love Spider man");
    }
}
