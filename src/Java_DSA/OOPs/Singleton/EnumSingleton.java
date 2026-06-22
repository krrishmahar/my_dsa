package Java_DSA.OOPs.Singleton;

public class EnumSingleton {


    static void main() {
        String key = AppConfig.INSTANCE.getApiKey();
        System.out.println(key);
    }
}
