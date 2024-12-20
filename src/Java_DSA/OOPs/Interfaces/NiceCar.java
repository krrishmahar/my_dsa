package Java_DSA.OOPs.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar() {
        engine = new ElectricEngine();
        player = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void upgradeEngine() {
        this.engine = new Car();
        System.out.println("Engine has been successfully upgraded");
    }

    public NiceCar(Media player) {
        this.player = (CDPlayer) player;
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }
}
