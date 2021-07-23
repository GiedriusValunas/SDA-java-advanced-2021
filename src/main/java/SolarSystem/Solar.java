package SolarSystem;

import java.util.Arrays;
import java.util.Iterator;

public class Solar {

    public static void main(String[] args) {

        System.out.println(Planets.MARS);
        System.out.println(Planets.MARS.name() + " distance from Earth: " + Planets.MARS.distanceFromEarth());
        System.out.println(Planets.VENUS);
        System.out.println(Planets.VENUS.distanceFromEarth());

        System.out.println("\n\n");

        // Ctrl+Alt+L to format code in IntelliJ
        for ( Planets onePlanet : Planets.values() ) {

            System.out.println( onePlanet );
            System.out.printf( "%s distance from Earth is %d km \n", onePlanet.name(), onePlanet.distanceFromEarth() );
        }

        // Iterate in for, use iterator for collection
        // Ctrl+Alt+L to format code in IntelliJ
        for ( final Iterator<Planets> planet = Arrays.asList( Planets.values() ).iterator(); planet.hasNext(); ) {

            Planets onePlanet = planet.next();
            System.out.println( onePlanet );
            System.out.printf( "%s distance from Earth is %d km \n", onePlanet.name(), onePlanet.distanceFromEarth() );
        }

    }
}
