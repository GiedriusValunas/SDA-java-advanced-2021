package Threads;

import java.lang.Thread;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelThread extends Thread {

    private Integer countUntil = 0;

    @Override
    public void run() {

        //calculate Fibonacci at given place
        Consumer<Integer> printFibonacci = nFib -> {

            final Long nthFib =
                    Stream.iterate( new long[] {1, 1}, f -> new long[] { f[1], f[0] + f[1] })
                            .limit( nFib )
                            .reduce((a, b) -> b)
                            .get()[0];

            System.out.println( this.toString() + " calculates " + nFib + "th Fibonacci number:" + nthFib );
        };

        printFibonacci.accept( countUntil );
    }

    ParallelThread( Integer countUntil ) {
        this.countUntil = countUntil;
    }
}
