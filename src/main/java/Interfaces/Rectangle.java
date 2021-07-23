package Interfaces;

public class Rectangle implements Shape {

    private double width;
    private double height;

    protected static int countShapes = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

        Rectangle.countShapes++;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    public int getCount() {
        return countShapes;
    }

}
