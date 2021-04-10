package Abstract;

public class Motorcycle extends Vehicle {

    public Motorcycle(int maxSpeed, int gasTank) {
        super(maxSpeed, gasTank);
    }

    @Override
    public void drive() {

        Engine engine = new Engine () {

            PassengerPlaces places = new PassengerPlaces() {
                @Override
                public void setPlaces(int places) {
                    this.places = 1;
                }
            };

            @Override
                public boolean go( String engineType ) {

                places.setPlaces( 2 );
                System.out.println("Specialized engine: " + engineType + " and places: " + places.getPlaces() );
                return true;
            }

        };

        System.out.println("3 wheel drive with specialized engine: " +
                engine.go( "PowerEngine" ));
    }

    private class Engine {

        public boolean go( String engineType ) {
            System.out.println("Standard engine");
            return false;
        }
    }

    private class PassengerPlaces {

        protected int places;

        public void setPlaces(int places) {
            this.places = places;
        }

        public int getPlaces() {
            return places;
        }
    }
}
