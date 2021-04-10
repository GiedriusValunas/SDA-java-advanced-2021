package Lambdas.Functions;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> functionInterface = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(functionInterface.apply("Jonas"));

        // return omited
        Function<Integer, String> functionInterface2 = integer -> integer + " magoes";

        System.out.println(functionInterface2.apply(5));

        Function<Integer, String> functionInterface3 = integer -> {
            if (integer == 1) {
                return integer + " mango";
            } else {
                return integer + " mangoes";
            }
        };

        System.out.println(functionInterface3.apply(7));

        System.out.println("================================");
        Function<Integer, Integer> function = i -> i * i;
        function = function.andThen(i -> i + 100);

        System.out.println(function.apply(10));

        Function<Integer, Integer> function2 = i -> i * i;
        function2 = function2.compose(i -> i + 100);

        System.out.println(function2.apply(-95));

        Function<Integer, Integer> function3 = i -> i * i;
        function3 = function3.compose(i -> i * 2);
        function3 = function3.andThen(i -> i + 100);

        System.out.println(function3.apply(10));
    }
}
