package Polymorphism;

public class Pizza extends DoughBall {

    public Pizza(int diameter, String name) {
        super(diameter, name);
    }

    public void bake() {
        System.out.println("baking " + name + " pizza size " + diameter);
    }

    @Override
    public String toString() {
        return super.name;
    }
}
