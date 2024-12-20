package Java_DSA.OOPs.Singleton;

public class singleton {

    private singleton() {
        //Singleton classes are used when coder doesn't want more than one instance(obj) of that class
//        simply private the constructor such that it is limited to this class only


    }

    private static singleton Instance;

    public static singleton getInstance() {
        return Instance;
    }

    void single(String name) {
        System.out.printf("hello, %d", name);
    }

    int ret(int a, int b) {
        System.out.println("the returned values are:");
        return (a + b) / 2;
    }


    public void setInstance(singleton instance) {
        Instance = instance;
    }

    public static void main(String[] args) {

//        singleton obj = new singleton();
//        singleton obj2 = new singleton();
//        singleton obj3 = new singleton();


    }

}
