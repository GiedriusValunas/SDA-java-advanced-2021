package Lambdas.Cart;

public class Shop {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

//        cart.addItem(new Item() {
//            @Override
//            public String getName() {
//                return "special item";
//            }
//
//            @Override
//            public double getPrice() {
//                return 100;
//            }
//        });

        double discountedPrice = cart.calculateDiscount(new Item() {
            @Override
            public String getName() {
                return "Special item";
            }

            @Override
            public double getPrice() {
                return 1000;
            }
        });

        System.out.println("Price with discount: " + discountedPrice);
    }
}
