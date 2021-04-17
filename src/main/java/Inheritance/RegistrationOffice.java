package Inheritance;

import java.util.Random;

public class RegistrationOffice {

    public static void main(String[] args) {

        Human human = new Human();

        human.move();

        System.out.println("================================");

        Worker worker = new Worker("John","0000000001");

        worker.move();

        worker.work();

        System.out.println("================================");

        Human smith = new Worker("Smith", "000000000002");

        smith.move();

        Worker burns = new OfficeWorker("Mr. Burns", "0000000000142");

        if(smith instanceof Worker) {

            ((Worker)smith).work();
        }

        // Cast of Type
        if( burns instanceof OfficeWorker ) {
            burns.work();
        }

        Human[] humans = new Human[3];
        try {

            humans[0] = human;
            humans[1] = worker;

            smith = null;
            humans[2] = smith;
            System.out.println( smith );

            humans[3] = burns;  // Exception is caused here [ java.lang.ArrayIndexOutOfBoundsException ]

        } catch ( ArrayIndexOutOfBoundsException hotPotato ) {

            System.out.println( "Array IO Message: " + hotPotato.toString() );

        } catch ( Throwable throwable ) {
            // sweep under the carpet exception :: total ignore

            System.err.println( throwable );
            throwable.printStackTrace();
        }

        finally {
            // Clear the array as it is corrupted
            System.out.println( "Clear: " );
            humans = new Human[31];
        }

        System.out.println( "And now: let's print:" );
        for ( int i =0; i < humans.length; i++ ) {

            Human man = new OfficeWorker( givenJava8RandomAlphanumeric(), "000000000" + i );

            man.move();
            System.out.println("In loop: " + man.toString());

        }
    }


    // Inspired by: https://www.baeldung.com/java-random-string
    public static String givenJava8RandomAlphanumeric() {

        int leftLimit = 97; // numeral 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        final String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> Character.isLetter( i ))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return Character.toTitleCase( generatedString.substring(0,1).charAt( 0 ) ) +
        generatedString.substring(1).toLowerCase();
    }

};