package Interfaces;

public class Plane {

    public static void main(String[] args) {

        Shape shape1 = new Circle(7);

        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getArea());

        Shape shape2 = new Rectangle(4, 5);

        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());

        Circle circle = new Circle(8);

        circle.colorize("green"); // ColoredShape

        System.out.println(circle.getArea()); // Shape

        Shape shape3 = circle;

        shape3.getArea();

        ColoredShape coloredShape = circle;

        coloredShape.colorize("blue");

    }
}
