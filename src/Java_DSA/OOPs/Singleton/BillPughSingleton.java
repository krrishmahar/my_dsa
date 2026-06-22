package Java_DSA.OOPs.Singleton;

public class BillPughSingleton {

}

class Singleton{
    private Singleton(){};
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
