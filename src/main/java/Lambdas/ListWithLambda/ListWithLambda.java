package Lambdas.ListWithLambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class ListWithLambda {

    public static void main(String[] args) {

        final List<String> names = new ArrayList<>();

        Function<String, Integer> stringLengthAsOverride = new Function<String, Integer>() {

            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };

        // Shorthand of above
        Function<String, Integer> stringLengthFunction =
                string -> string.length();

        // Lambda expression as a variable
        final Runnable myRunnable = () -> {
            System.out.println("Running a runnable");

            // Predicate::test method override { return predicate.test( String ) }
            Predicate<String> startsWithMTest = string -> string.startsWith("M");

            // With lambda, variable name
            names.stream().filter( startsWithMTest.negate() ).
                    forEach( name -> System.out.println( name + " length: [" +
                            stringLengthAsOverride.apply( name ) + "]" )
                    );
        };

        names.add("John");
        names.add("Marry");
        names.add("Sue");
        names.add("Tom");
        names.add("Richard");

        Collections.sort(names);

        // for:each
        for (String name : names) {
            System.out.println(name);

            myRunnable.run();
        }

        names.forEach( string -> System.out.println( string ) );

        // Same as above
        // Method reference for lambda
        names.forEach( System.out::println );

        myRunnable.run();

        final Supplier<Integer> randomNumberAsOverride = new  Supplier<Integer>() {

            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        // Shorhanded as;
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();

        Arrays.stream( new Integer [ ] {
                randomNumberSupplier.get(),
                randomNumberAsOverride.get() } ).sorted().forEach( System.out::println );

        Consumer<Double> printWithPrefixAsOverride = new Consumer<Double>() {

            Double saveAs;

            @Override
            public void accept(Double aDouble) {
                saveAs = aDouble;
                System.out.println("Value: " + saveAs );
            };
        };

        Consumer<Double> incrementConsumer = dblnum -> {
            dblnum++;
            System.out.println("Value: " + dblnum );
        };

        incrementConsumer.accept(10.5);
        printWithPrefixAsOverride.accept( 12.34 );

        UnaryOperator<Double> toSquareUnaryOpAsOverride = new UnaryOperator<Double>() {

            @Override
            public Double apply(Double dbl) {
                return dbl * dbl;
            }
        };

        UnaryOperator<Integer> toSquareUnaryOperator = i -> i * i;

        incrementConsumer.accept(
                toSquareUnaryOpAsOverride.apply( toSquareUnaryOpAsOverride.apply( 5.0d ) )
        );

    }
}
