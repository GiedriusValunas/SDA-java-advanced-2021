package Lambdas.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ShoppingCart {

    private List<Item> cartItems;

    ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        cartItems.add(item);
    }

    public double calculateDiscount(Item item) {

        Function<Double, Double> calculateDiscount = new Function<Double, Double>() {
            @Override
            public Double apply(Double aFloat) {
                return aFloat - (aFloat * 0.2);
            }
        };

        calculateDiscount = calculateDiscount.compose(aDouble -> {
            if (aDouble < 0) {
                return 0.0;
            } else {
                return aDouble;
            }
        });

        calculateDiscount = calculateDiscount.andThen(aDouble -> {
            if (aDouble >= 100) {
                return aDouble - 10;
            } else {
                return aDouble;
            }
        });

        return calculateDiscount.apply(item.getPrice());
    }
}
