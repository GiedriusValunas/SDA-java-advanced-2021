package Enums;

public class Movment {

    float delta;
    Axis axis;
    float startingPosition;

    public Movment(float startingPosition) {
        this.startingPosition = startingPosition;
    }

    public void move(float delta, Axis axis) {
        startingPosition += delta;
        this.axis = axis;
    }
}
