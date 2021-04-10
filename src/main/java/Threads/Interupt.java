package Threads;

public class Interupt {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0 ; i < 120; i ++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("thread interrupted");
                }
            }
        });
        thread.start();

        thread.interrupt();
    }
}
