package Abstract;

public abstract class Car extends Vehicle {

    public Car(int maxSpeed, int gasTank) {
        super(maxSpeed, gasTank);
    }

    public abstract void useFuel();
}
