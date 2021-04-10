package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams1 {

    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();

//        Phone phone = new Phone("iPhone", 3000);
//        phones.add(phone);
        phones.add(new Phone("iPhone", 3000));
        phones.add(new Phone("Android", 1500));
        phones.add(new Phone("Blackberry", 5000));
        phones.add(new Phone("Sony", 2000));
        phones.add(new Phone("Xiaomi", 500));

        phones.stream()
                .filter(phone -> phone.price > 1500) // stream<Phone>
                .map(phone -> phone.giveDiscount(phone.price))// stream<Integer>
                .forEach(price -> System.out.println(price));

        List<Integer> prices = phones.stream()
                .filter(phone -> phone.price < 3000)
                .map(phone -> phone.price)
                .collect(Collectors.toList());

        System.out.println(prices);

        Map<String, Integer> namePriceMap = phones.stream()
                .filter(phone -> phone.price > 500)
                .collect(Collectors.toMap(phone -> phone.name, phone -> phone.price));

        System.out.println(namePriceMap);

        int sumOfPrices = phones.stream()
                .filter(phone -> phone.price > 1000)
                .map(phone -> phone.price)
                .reduce(0, (sum, price) -> sum + price);

        System.out.println("=========");
        System.out.println("Sum " + sumOfPrices);


    }
}
