package Abstract;

public class DieselCar extends Car {

    public DieselCar(int maxSpeed, int gasTank) {
        super(maxSpeed, gasTank);
    }

    @Override
    public void useFuel() {
        System.out.println("burns diesel");
    }

    @Override
    public void drive() {
        System.out.println("4 wheel drive");
    }
}
