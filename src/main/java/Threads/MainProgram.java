package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainProgram {

    public static void main(String[] args) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }

        Integer countThreads = 1000;
        for (int i = 0; i < countThreads; i++) {

            ParallelThread parallelThread = new ParallelThread( 20 );
            parallelThread.start();

        }

        Future<Integer> future = new FibonacciExecutor().calculate(10);

        while(!future.isDone()) {
            System.out.println("Calculating...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Integer result = future.get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        AtomicInteger atomicInteger = new AtomicInteger(1);


    }
}
