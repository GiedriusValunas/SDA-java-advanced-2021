package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLongArray;

public class FibonacciExecutor {

    // Always keep in memory
    volatile private AtomicLongArray array = new AtomicLongArray( 10 );

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(int i) { return null;

    }

}
