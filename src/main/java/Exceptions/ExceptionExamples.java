package Exceptions;

import java.io.Closeable;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {

        String[] array = new String[2];

        array[0] = "city";
        array[1] = null;

        try {

            System.out.println(array[1].toUpperCase());
            array[2] = "Sara";

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("there is no such element in array");
        } catch (NullPointerException exception) {
            System.out.println("unexpected null pointer " + exception.getMessage());
        } catch (Exception e) {
            System.out.println("unknown exception");
        }

        try {
            int value = 5 / 0;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

        int width = 5;
        int height = 0;
        try {
            int answer = width * height;

            if (answer == 0) {
                throw new ArithmeticException("width and height must be above 0");
            }
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("enter value for calculation");

/*        // JAVA6/7
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
        }
        catch( Exception e ) {
        // ...
        } finally {

            if ( null != scanner ) {

                try {
                    scanner.close();
                } catch ( Exception closed ) {

                }
            }
            scanner = null;
        }*/

        try (AutoCloseable scanner = new Scanner(System.in)) {
            String input = ((Scanner) scanner).nextLine();

            int number = Integer.parseInt(input);
            int answer = 44 / number;
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("bad input" + e.getMessage() +  " : " + e.getClass() );
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("thank you for using advanced calculator pro");
        }
    }
}
