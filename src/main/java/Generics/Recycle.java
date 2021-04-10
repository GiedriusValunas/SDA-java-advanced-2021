package Generics;

import java.util.ArrayList;
import java.util.List;

public class Recycle {

    public static void main(String[] args) {

        RecycleMachine<GlassBottle> recycleMachine = new RecycleMachine<>();

        GlassBottle[] glassBottles = new GlassBottle[2];

        glassBottles[0] = new GlassBottle();
        glassBottles[1] = new GlassBottle();

        int moneyForRecycling = recycleMachine.recycle(glassBottles);
        System.out.println("you have earned: " + moneyForRecycling);

        RecycleMachine<PlasticBottle> plasticRecycle = new RecycleMachine<>();

        PlasticBottle[] plasticBottles = new PlasticBottle[3];

        plasticBottles[0] = new PlasticBottle();
        plasticBottles[1] = new PlasticBottle();
        plasticBottles[2] = new PlasticBottle();

        moneyForRecycling = plasticRecycle.recycle(plasticBottles);
        System.out.println("you have earned: " + moneyForRecycling);



//        List<? extends Car> list = new ArrayList<>(); // down inheritance tree
//        List<? super Integer> list1 = new ArrayList<>(); // up inheritance tree
    }
}
