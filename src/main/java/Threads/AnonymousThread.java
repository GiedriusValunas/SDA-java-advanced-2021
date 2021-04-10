package Threads;

public class AnonymousThread {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is not main thread");
            }
        });

        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("another thread");
        });

        thread1.start();

        new Thread(() -> {
            System.out.println("short definition of thread");
        }).start();

        RunnableThing runnableThing = new RunnableThing();
        Thread thread2 = new Thread(runnableThing);

        thread2.start();
    }
}
