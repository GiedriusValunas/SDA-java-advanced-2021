package Inheritance;

public class Human {

    // invisible to child class
    private int legs;

    public int hands;

    public Human() {
        legs = 2;
        hands = 2;
        System.out.println("human born");
    }

    public void move() {
        System.out.println("human walks");
    }
}
