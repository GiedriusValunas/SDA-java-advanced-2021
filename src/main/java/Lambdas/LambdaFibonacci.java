package Lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaFibonacci {

    public static void main(String[] args) {

        //calculate Fibonacci at given place
        Consumer<Integer> printFibonacci = nFib -> {

            final Long nthFib =
                    Stream.iterate( new long[] {1, 1}, f -> new long[] { f[1], f[0] + f[1] })
                            .limit( nFib )
                            .reduce((a, b) -> b)
                            .get()[0];

            System.out.println("Value of " + nFib + "th Fibonacci number:" + nthFib );
        };

        Arrays.stream((new Integer [] { 13, 10, 11, 9, 12 , 8, 2 } ))
                .sorted().forEach( printFibonacci );

    }

}