package Streams;

import java.io.Serializable;

public class Phone implements Serializable {

    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int giveDiscount(int discount) {
        return this.price - discount;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
