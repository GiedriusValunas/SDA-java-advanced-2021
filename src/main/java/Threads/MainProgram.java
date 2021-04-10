package Threads;

public class MainProgram {

    public static void main(String[] args) {

        ParallelThread parallelThread = new ParallelThread();

        parallelThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }

        for (int i = 0; i < 500; i++) {
            System.out.println("main thread" + i);
        }
    }
}
