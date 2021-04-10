package Inheritance;

public class Worker extends Human {

    private String name;
    private String socialSecurityNumber;

    public Worker(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        System.out.println("worker registered");
    }

    @Override
    public void move() {
        System.out.println("worker rides bus to work");
    }

    @Override
    public String toString() {
        return "I am " + name + " my number: " + socialSecurityNumber +
                " I have " + hands + " hands";
    }

    public void work() {
        System.out.println("worker works");
    }
}
