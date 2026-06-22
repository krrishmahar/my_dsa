package Java_DSA.OOPs.Singleton;

import java.util.ArrayList;
import java.util.List;

//Thread-Safe Implementation (Double-Checked Locking) of Singleton Pattern
public class doubleLocked {

    static DatabaseConnectionPool pool2 = DatabaseConnectionPool.getInstance();
    static DatabaseConnectionPool pool1 = DatabaseConnectionPool.getInstance();

    static void main() {

        System.out.println(pool1 == pool2); // true — same object
    }

}

class DatabaseConnectionPool {

    //volatile keyword used to have clear visibility of an instance
//  volatile keyword ensures that JVM should not check the L cache - L1, L2, L3 but, directly read/write to main memory
//    The volatile keyword tells the JVM: always read this variable from main memory,
//    and always write directly to main memory (bypassing CPU cache).
//    It ensures visibility but not atomicity.

    private static volatile DatabaseConnectionPool instance;
    private int maxConnections;
    private List<String> connectionPool;

    //Private constructor
    private DatabaseConnectionPool() {
        maxConnections = 10;
        connectionPool = new ArrayList<>();
        System.out.println("Connection pool initialized");
    }

    // Double-checked locking for thread safety without synchronizing every call
    public static DatabaseConnectionPool getInstance(){
        if (instance == null) { //first check no lock - fast
            synchronized (DatabaseConnectionPool.class){ //second check with lock -safe and slow
                if (instance == null){
                    instance = new DatabaseConnectionPool();
                }
            }
        }
        return instance;
    }

    public int getMaxConnections() {return maxConnections;};

}
