package Java_DSA.OOPs.Interfaces;

import Java_DSA.OOPs.accessModifier.Main;

public class Car implements Engine, Brake, Media {


    @Override
    public void brake() {
        System.out.println("I break like a normal petrol car");
    }

    @Override
    public void start() {
        System.out.println("I start the engine like a normal petrol car");
    }

    @Override
    public void stop() {
        System.out.println("I stop the engine like a normal petrol car");
    }

    @Override
    public void volUp() {
        System.out.println("Volume Up");
    }


    @Override
    public void volDown() {
        System.out.println("Volume Down");
    }

    @Override
    public void accl() {
        System.out.println("I accelerate like a normal car");
    }
}
