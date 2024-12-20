package Java_DSA.OOPs.Interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Rock music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }

    @Override
    public void volUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volDown() {
        System.out.println("Volume Down");
    }
}
