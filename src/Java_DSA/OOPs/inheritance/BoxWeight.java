package Java_DSA.OOPs.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);// this calls constructor of parent(Box) which takes an obj
        weight = other.weight / 2;

    }

    //    @Override
    static void greeting() {
        System.out.println("Hello! I'm under the boxWeight please help me");
    }

    public BoxWeight(double l, double w, double h, double weight) {

//        Usecase of super keyword:
//        1. to call parent constructors
        super(l, w, h);// this calls the parent class constructor which takes 3 parameter.
        //super keyword initializes the parameter from the parent class
        //super calls must be 1st thing to initiated since it calls parent else it gives error

//        2. to refer the parent var like 'this'
        super.radius = 0;

//        NOTE: If super( ) is not used in subclass' constructor,
//        then the default or parameterless constructor of each superclass
//        will be executed.

        this.weight = weight;

/*      You can only specify one superclass for any subclass that you create. Java does not support the inheritance of
        multiple superclasses into a single subclass. You can, as stated, create a hierarchy of inheritance in which a subclass
        becomes a superclass of another subclass. However, no class can be a superclass of itself.*/

    }

    public static void main(String[] args) {


    }
}
