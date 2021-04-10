package Abstract;

public class Road {

    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle(300,500);
        motorcycle.drive();

//        Vehicle vehicle = new Vehicle(20,20);

        DieselCar dieselCar = new DieselCar(150,1500);

        dieselCar.drive();
        dieselCar.useFuel();

        PetrolCar petrolCar = new PetrolCar(200,1000);

        petrolCar.drive();
        petrolCar.useFuel();

        // Polymorphic calls. i.e. "override" is needed.
        ElectricScooter boltScooter = new BoltScooter( 25 );
        boltScooter.drive();
        System.out.println( boltScooter.getGasTank() );

        System.out.println( "Show dieselCar: " + dieselCar );

        System.out.println( "Show petrolCar: " + petrolCar.toString() );

        System.out.println( "Show electricScooter: " + boltScooter ); //implicit call String::toString

        boltScooter.charge();

        // Polymorphic calls. i.e. "override" is needed.
        ElectricScooter cityBeeScooter = new BoltScooter( 15 );
        cityBeeScooter.charge();

    }
}
