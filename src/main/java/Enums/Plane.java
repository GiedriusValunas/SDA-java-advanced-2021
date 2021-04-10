package Enums;

public class Plane {

    public static void main(String[] args) {

        Movment movment = new Movment(0.0f);

        movment.move(10f, Axis.Y);
        movment.move(6f, Axis.X);

    }
}
