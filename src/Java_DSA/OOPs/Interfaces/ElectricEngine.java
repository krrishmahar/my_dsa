package Java_DSA.OOPs.Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopping");
    }

    @Override
    public void accl() {
        System.out.println("Taking the pace now");
    }
}
