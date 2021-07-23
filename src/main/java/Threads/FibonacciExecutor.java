package Threads;

import java.time.Instant;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FibonacciExecutor implements Callable<Long> {

    private Long nFib = 1L;

    // Always keep in memory
    volatile private AtomicLongArray array = new AtomicLongArray( 10 );

    private ScheduledExecutorService executor =
            Executors.newScheduledThreadPool(10 );

    protected Future<Long> calculate( Long nFib ) {

        this.nFib = nFib;

        System.out.println( "Calculate the same using Futures..." );
        final ScheduledFuture<Long> scheduled =
            executor.schedule( this, 2, TimeUnit.SECONDS );

        while ( !scheduled.isDone() ) {

            try {

                Thread.sleep(30);
                System.out.println(
                        String.format( "Future... [%s] for... %s",
                                Thread.currentThread(), Instant.now() ) );

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        executor.shutdown();

        return scheduled;
    }

    @Override
    public Long call() throws Exception {

        //calculate Fibonacci at given place
            final Long nthFib =
                    Stream.iterate(new long[]{1, 1}, f -> new long[]{f[1], f[0] + f[1]})
                            .limit( this.nFib )
                            .reduce((a, b) -> b)
                            .get()[0];

        System.out.println( this.toString() + " calculates " + nFib + "th Fibonacci number:" + nthFib );

        return nthFib;
    }
}