package Interfaces;

public class Cube implements Shape3D {

    private double width;
    protected static int countShapes = 0;

    public Cube(double width) {
        this.width = width;

        Cube.countShapes++;
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

    @Override
    public int getCount() {
        return Cube.countShapes;
    }
}
