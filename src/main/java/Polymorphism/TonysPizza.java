package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TonysPizza {

    public static void main(String[] args) {

        DoughBall[] order = new Pizza[ 4 ];

        order[0] = new PineapplePizza( Size.BIG.getDiameter());
        order[1] = new PeperoniPizza(Size.MEDIUM.getDiameter());
        order[2] = new VegetarianPizza(Size.SMALL.getDiameter());
        order[3] = new VegetarianPizza(Size.BIG.getDiameter());

        for (DoughBall ball : order) {
            System.out.println( ball );
        }

        List<DoughBall> list = new ArrayList( );
        list.addAll( Arrays.asList(order) );

        Iterator<DoughBall> ii = list.iterator();
        while ( ii.hasNext() ) {

            Pizza pizza = (Pizza)( ii.next() );

            if ( pizza instanceof PeperoniPizza ) {

                System.out.println( "For Peperoni only: " );
                pizza.bake();

            } else {

                pizza.bake();
            }
        }
    }
}
