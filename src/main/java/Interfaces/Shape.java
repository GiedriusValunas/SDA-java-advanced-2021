package Interfaces;

public interface Shape {

    abstract double getArea();
    abstract double getPerimeter();

    // Define as default
    default int getCount() {
        return 0;
    }

    // Two of them, each for a type
    default String print() {
        return "Shapes: " + this.getClass().getSimpleName();
    }

}
