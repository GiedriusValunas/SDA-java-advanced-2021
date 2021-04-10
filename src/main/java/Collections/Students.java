package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Students {

    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();

        studentSet.add("John");
        studentSet.add("John");
        studentSet.add("Tom");
        studentSet.add("Sally");

        System.out.println(studentSet);

        studentSet.remove("Tom");

        for (String studentName : studentSet) {
            System.out.println(studentName);
        }

        Iterator<String> iterator = studentSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        boolean contains = studentSet.contains("Tom");

        System.out.println("Tom is in class: " + contains);

    }
}
