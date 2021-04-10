package Lambdas.ListWithLambda;

import java.util.ArrayList;
import java.util.List;

public class ListWithLambda {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Marry");
        names.add("Sue");
        names.add("Tom");

        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(name -> System.out.println(name));

    }
}
