package Interfaces;

public class Circle implements Shape, ColoredShape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.1415;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * 3.1415;
    }

    @Override
    public void colorize(String color) {
        System.out.println("painting shape in color " + color);
    }
}
