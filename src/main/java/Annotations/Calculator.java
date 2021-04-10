package Annotations;

public class Calculator {

    public static void main(String[] args) {

        Cube cube = new Cube(3);

        cube.getVolume();


        System.out.println("new feature");

        cube.calculateVolume();
    }
}
