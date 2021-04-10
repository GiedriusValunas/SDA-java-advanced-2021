package Abstract;

public abstract class ElectricScooter extends Vehicle {

    public ElectricScooter( int maxSpeed ) {
        super( maxSpeed, 0 );
    }

    abstract public void charge();

    @Override
    public String toString() {
        return "Electric scooter: " + "max speed: " + getMaxSpeed();
    }
}
