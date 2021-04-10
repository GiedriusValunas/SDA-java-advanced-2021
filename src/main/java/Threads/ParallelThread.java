package Threads;

public class ParallelThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("parallel thread " + i);
        }
    }
}
