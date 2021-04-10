package Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ResourceManagement {

    static int counter = 0;

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    synchronized static void increaseCounter() {
        counter++;
    }

    public static void main(String[] args) {

        Thread counterIncrease = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                counter++;
                increaseCounter();
                atomicInteger.addAndGet(1);
            }
            System.out.println("Thread one finished " + counter);
            System.out.println("Thread one atomic " + atomicInteger.get());
        });

        Thread counterIncrease1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                counter++;
                increaseCounter();
                atomicInteger.addAndGet(1);
            }
            System.out.println("Thread two finished " + counter);
            System.out.println("Thread two atomic " + atomicInteger.get());
        });

        counterIncrease.start();
        counterIncrease1.start();
    }
}
