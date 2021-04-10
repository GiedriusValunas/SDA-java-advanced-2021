package Exceptions;

public class GrowChild {

    public static void main(String[] args) {

        Child child = new Child();

        try {
            child.setAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("child current age is " + child.getAge());
    }
}
