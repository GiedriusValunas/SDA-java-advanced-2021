package Streams;

public class Phone {

    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int giveDiscount(int price) {
        return price - 100;
    }
}
