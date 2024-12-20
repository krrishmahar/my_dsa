package extra_notes;


class myThread extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 10) {
            System.out.println("Thread 1 is running successfully!");
            i++;
        }
    }
}

class myThread2 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 10) {
            System.out.println("Thread 2 has failed to run!!");
            i++;
        }
    }
}


class myRunnableThread implements Runnable {
    @Override
    public void run() {
//        for (int i = 0; i < 500; i++) {
//        }
        while (true) {
            System.out.println("I am a thread, not a threat!");
        }
    }

}

class myRunnableThread2 implements Runnable {
    @Override
    public void run() {
//        for (int i = 0; i < 500; i++) {
//            System.out.println("I am a thread and I'm running!");
//        }
        while (true) {
            System.out.println("I am a thread and I'm running!");
        }
    }
}


public class multithreading {

    public static void main(String[] args) {
//        multiprocessing and multithreading is a topic of OS.
//        In OS, multiple tabs can work i.e, multiprocessing which is heavyweight
//        process -> thread1, thread2, thread3 ....
//        whereas Thread utilizes shared memory makes context switching faster i.e, lightweight

//        Concurrency is when a thread holds multiple computation but proceed with one at one instance
//        Parallelism is when a thread do multiple computation at a single instance
//        multithreading helps us to achieve concurrency

//        Threads makes process work in parallel and concurrency
//        And, it can be implemented by
//            1. By extending thread class --
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
//                t1.start();
//                t2.start();

//            2. implement Runnable interface
        myRunnableThread bullet1 = new myRunnableThread();
        Thread gun1 = new Thread(bullet1);
        myRunnableThread2 bullet2 = new myRunnableThread2();
        Thread gun2 = new Thread(bullet2);
//        gun1.start();
//        gun2.start();


    }


}
