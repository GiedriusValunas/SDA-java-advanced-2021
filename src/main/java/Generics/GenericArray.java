package Generics;

import Inheritance.Worker;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class GenericArray {

    public static void main(String[] args) {

        // 1990
        int [] array = new int [ 10 ];
        for ( int i = 0; i < array.length; i ++ ) {

            array[ i ] = i;

            System.out.println( "Value: " + array[ i ] );
        }

        // 2001
        float [] floats = new float[ 10 ];
        for ( int i = 0; i < array.length; i ++ ) {

            floats[ i ] = i;

            System.out.println( "Value: " + floats[ i ] );
        }

        // 2020
        String [] strings = new String[ 10 ];
        for ( int i = 0; i < array.length; i ++ ) {

            strings[ i ] = String.valueOf( i );

            System.out.println( "Value: " + strings[ i ] );
        }

        // 2020
        ValuesOf [] enums = new ValuesOf[ 10 ];
        for ( int i = 0; i < array.length; i ++ ) {

            strings[ i ] = String.valueOf( i );

            System.out.println( "Value: " + strings[ i ] );
        }

        // 2021
        GenericBox< BigDecimal >[ ] bigDecimals;

        GenericBox< BigDecimal > bigDecimalBoxed =
                new GenericBox<BigDecimal>( BigDecimal.ZERO );

        Set< BigDecimal > bigDecimalSet = new HashSet<>();
        bigDecimalSet.add( bigDecimalBoxed.getItem() );

        GenericBox.printCollection( bigDecimalSet );

        GenericBox.printList( bigDecimalBoxed.getItems() );

        GenericBox< Float > floatBoxed =
                new GenericBox< Float >( 0.01f );

        System.out.println(
        "What is in the box? " + bigDecimalBoxed );

        System.out.println(
        "What is in the box? " + floatBoxed );

        GenericBox< ValuesOf > valuesBoxed =
                new GenericBox< ValuesOf >( ValuesOf.DOS );

        System.out.println(
        "What is in the box? " + valuesBoxed );

        // 2022
        Worker[] workers = new Worker[ 10 ];
        for ( int i = 0; i < array.length; i ++ ) {

            workers[ i ] = new Worker();

            System.out.println( "Value: " + strings[ i ] );
        }

        // 2023
        GenericBox< Worker > workersBoxed = new GenericBox<>(new Worker());
        workersBoxed.getItem().setName( "Albert" );
        workersBoxed.getItem().setSocialSecurityId( "0000022161" );

        try {
            workersBoxed.getItem().refect();

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println(
                "What is in the box? " + workersBoxed );

        workersBoxed.printItems();

        // Lower bounded
        workersBoxed.printHumans( workersBoxed.getItems() );

        // Upper bounded
        workersBoxed.printWorkers( workersBoxed.getItems() );

    }

    enum ValuesOf {

        UNO,
        DOS
    }

    // Generic! (type defined as T)

/*

    List <T>
    T[]
    T

*/


}
