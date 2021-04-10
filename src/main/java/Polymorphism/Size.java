package Polymorphism;

public enum Size {

    BIG(40),
    MEDIUM(38),
    SMALL(30);

    private int diameter;

    Size(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
