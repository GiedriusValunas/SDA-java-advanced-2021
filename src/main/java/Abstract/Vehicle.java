package Abstract;

public abstract class Vehicle {

    private int maxSpeed;
    private int gasTank;

    public Vehicle(int maxSpeed, int gasTank) {
        this.maxSpeed = maxSpeed;
        this.gasTank = gasTank;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getGasTank() {
        return gasTank;
    }

    public abstract void drive();
}
