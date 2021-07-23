package Exceptions;

import Interfaces.Shape;

public class MeetTheFriends {

    public static void main(String[] args) {

        try {
            int x = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println("1st Exception is caught and handled!" + e.getClass() + " :" + e.getMessage());
        }

        // Throwable
        // Exception
        // RuntimeException
        // ArithmeticException

        int x = 0, y = 0;
        try {
            x = y / 0;

        } catch ( Exception e ) {
            System.out.println("2nd Exception is caught and handled!" + e.getClass() + " :"
                    + e.getMessage());
        } finally {

            System.out.println("This will be printed no matter what the value of y is");
        }

        int [] intArray = new int[ 20 ];
        intArray[ 10 ] = 2;
        y = 2;

        try {

            int z = intArray[ 10 ] / y;
            throw new InvalidAgeException( "My InvalidAgeException Exception" );

        } catch( ArithmeticException | ArrayIndexOutOfBoundsException e ) {

            final Shape shape = new Shape() {

                @Override
                public double getArea() {
                    return 0;
                }

                @Override
                public double getPerimeter() {
                    return 0;
                }

                @Override
                public int getCount() {
                    return 0;
                }

                @Override
                public String print() {
                    return this.toString();
                }
            };

            if ( e instanceof ArithmeticException )  {
                System.out.println("ArithmeticException caught! " + shape.print() );

            } else {
                System.out.println("ArrayIndex(...)Exception caught!");
                e.printStackTrace();
            }

        } catch( InvalidAgeException e ) {

            System.out.println("Invalid age exception caught! " + e.getClass() );
            e.printStackTrace();

        } catch( Exception e ) {
            System.out.println("Another exception caught! " + e.getClass() );
            e.printStackTrace();

        } finally {
            System.out.println("All exceptions are now handled!");

        }

    }

    // OK, The goal: meet friends in the city (how do I get there?)
    // In-house place (time)

    // Expenses : drinks, food, flowers chocolates

    // Error and Exception

    /*
    Ad-hoc:   @ 7pm at work, card payments, nearby

    try {

      -- it is 15th of the day: Direct debit : leasing + rent
      -- card is declined:

       Exception one: to process the payment.
       Handling:     Mobile transfer to card.

       Time is over-limit;
       Exception two: late taxi

    catch ( Throwable ) {

    }
    */


    /*
    Over-thinking: 19:30 until then:

    try {
    1) Get some cash
    catch ( NotEnoughCash ) {

    }

    public void parking() throws ParkingFullError;

    2) Check the status in google traffic

    try {
    // 3) Parking

    this.parking();

    } catch( ParkingFullError | NotEnoughCashException ) {

    }

    4) Leave the car overnight

    try {
    5) City bee
    } catch ( NoCityBeeAvailableError | TooDrunkToDriveException | NotEnoughCash ) {

    }

    */

}
