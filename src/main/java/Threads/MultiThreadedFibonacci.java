package Threads;

import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLongArray;

public class MultiThreadedFibonacci {

    public static void main(String[] args) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }

        Integer countThreads = 10;
        for (int i = 0; i < countThreads; i++) {

            ParallelThread parallelThread = new ParallelThread( 20 );
            parallelThread.start();

        }

        Future<Long> future = new FibonacciExecutor().calculate(20l );

        while( !future.isDone() ) {

            try {
                Thread.sleep(30);
                System.out.println( "Calculating... for... " + Instant.now() );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        try {
            Long result = future.get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        AtomicLongArray atomicLongArray = new AtomicLongArray(30 );

        // Set initially to one
        atomicLongArray.set( 0 , 1 );

        // Add and get: as one operation
        Future<Long> future30th = new FibonacciExecutor().calculate(
                atomicLongArray.addAndGet( 0, 25 ) );

        try {
            Long result30th = future30th.get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
