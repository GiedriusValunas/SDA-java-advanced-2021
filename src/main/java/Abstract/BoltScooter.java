package Abstract;

public class BoltScooter extends ElectricScooter {

    public BoltScooter( int maxSpeed ) {
        super( maxSpeed );
        this.charge();
    }

    @Override
    public void charge() {

        if ( getMaxSpeed() >= 20 ) {

            class Battery {
                protected String batteryType;

                public Battery(String type) {
                    this.batteryType = type;
                }

                @Override
                public String toString() {
                    return " Battery {" +
                            "batteryType='" + batteryType + '\'' +
                            '}';
                }
            }
            final Battery battery = new Battery("Ni-Li");
            System.out.println( "charging Bolt scooter..." + battery );
        } else {

            System.out.println( "Does not need charging for " + getMaxSpeed() );
        }


    }

    @Override
    public void drive() {
        System.out.println("2 wheel Bolt scooter");
    }

    @Override
    public int getGasTank() {
        System.out.println( "No gas needed, it's electric!" );
        return -1;
    };

}
