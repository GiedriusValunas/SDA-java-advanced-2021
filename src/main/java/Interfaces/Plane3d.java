package Interfaces;

public class Plane3d {

    public static void main(String[] args) {

        Cube cube = new Cube(3);

        cube.getArea();
        cube.getPerimeter();

        cube.getVolume();

        Shape myShape = new Shape() {

            @Override
            public double getArea() {
                return 10;
            }

            @Override
            public double getPerimeter() {
                return 10;
            }

            public int getCount() {
                return 0;
            }
        };

        Shape cubeAsShape = cube;

        // Polymorphic call to Cube::getPerimeter
        System.out.println( "Perimeter of a " + cubeAsShape.print()  + " perimeter: "+ cubeAsShape.getPerimeter() );

        // Call to retrieve a static counter Cube::getCount
        System.out.println( "We have created " + (new Cube(4)).getCount() + " "
                + cubeAsShape.print() +"(s)" );
    }
}
