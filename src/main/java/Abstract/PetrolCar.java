package Abstract;

public class PetrolCar extends Car {

    public PetrolCar(int maxSpeed, int gasTank) {
        super(maxSpeed, gasTank);
    }

    // inherited from Vehicle
    @Override
    public void drive() {
        System.out.println("4 wheel drive");
    }

    // inherited from Car
    @Override
    public void useFuel() {
        System.out.println("burns petrol");
    }

}
