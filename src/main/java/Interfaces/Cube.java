package Interfaces;

public class Cube implements Shape3D {

    private double width;

    public Cube(double width) {
        this.width = width;
    }

    @Override
    public double getVolume() {
        return width * width * width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 6 * width * width;
    }
}
