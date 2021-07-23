package Abstract;

public abstract class Vehicle implements IVehicle {

    // Encapsulation is back
    protected int maxSpeed = 0;
    private int gasTank = 0;

    public Vehicle(int maxSpeed, int gasTank) {

        this.maxSpeed = maxSpeed;
        this.gasTank = gasTank;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getGasTank() {
        return gasTank;
    }

    public abstract void drive();
}