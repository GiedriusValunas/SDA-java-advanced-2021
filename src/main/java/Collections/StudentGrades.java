package Collections;

import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Tom", 7);
        students.put("Tom", 9);
        students.put("Mike", 6);
        students.put("Sally", 4);
        students.put("John", 3);
//        stundent.put(key, value);

        System.out.println(students);

        boolean contains = students.containsKey("Tom");

        System.out.println("Tom is in class: " + contains);

        if (contains) {
            int grade = students.get("Tom");

            System.out.println("Toms grade: " + grade);
        }

        students.replace("Sally", 8);

        boolean classEmpty = students.isEmpty();

        System.out.println("Class is empty: " + classEmpty);

        int size = students.size();

        System.out.println("Students in class: " + size);

        Collection<Integer> allGrades = students.values();
        int allGradeSum = 0;
        for (Integer grade : allGrades) {
            allGradeSum += grade;
        }
        int avg = allGradeSum / allGrades.size();
        System.out.println("Our class average: " + avg);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
