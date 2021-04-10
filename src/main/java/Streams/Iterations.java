package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterations {

    public static void main(String[] args) {

        Stream.iterate(1, i -> i + 1)
                .filter(num -> num % 5 == 0)
                .limit(5)
                .forEach(num -> System.out.println(num));

        System.out.println("=========");

        Map<String, Integer> iterationResult = Stream.iterate(10, i -> i + 2)
                .filter(num -> num % 5 == 0)
                .limit(7)
                .collect(Collectors.toMap(num -> "number is :" + num, num -> num));

        System.out.println(iterationResult);
    }
}
