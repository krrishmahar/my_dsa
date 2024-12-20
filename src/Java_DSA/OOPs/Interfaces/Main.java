package Java_DSA.OOPs.Interfaces;

/*
Multiple inheritance is not available in java.
        (Same functions in 2 classes it will skip that hence no multiple inheritance)

Instead we have java interfaces. they have abstract functions (no body of functions)

Interface is like class but not completely. it is like an abstract class.
By default functions are public and abstract in interface.
variables are final and static by default in interface.*/

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
//        car.start();
//        car.accl();
//        car.brake();

        Media mediaCar = new Car();
//        mediaCar.start();

        NiceCar ferrai = new NiceCar();
        ferrai.start();
        ferrai.stop();
        ferrai.startMusic();
        ferrai.upgradeEngine();
        ferrai.start();


    }

}
