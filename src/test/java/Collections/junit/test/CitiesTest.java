package Collections.junit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CitiesTest {

    @Test
    void verifyExample1() {


        List<String> cityList = new ArrayList<>();

        cityList.add("Vilnius");
        cityList.add("Kaunas");
        cityList.add("Prague");

        System.out.println(cityList);

        cityList.add(1, "Barcelona");

        System.out.println(cityList);

        String city = cityList.get(2);

        System.out.println(city);

        System.out.println("================");

        int size = cityList.size();

        System.out.println("array list size: " + size);

        cityList.remove("Prague");

        System.out.println(cityList);

        cityList.remove(0);

        System.out.println(cityList);

        int index = cityList.indexOf("Kaunas");

        System.out.println("Kaunas element index is: " + index);

        cityList.add("Trakai");

        cityList.add("Kaunas");

        int lastIndex = cityList.lastIndexOf("Kaunas");

        System.out.println("Last element Kaunas index: " + lastIndex);

        System.out.println(cityList);

        boolean contains = cityList.contains("Trakai");

        System.out.println("Trakai is present in list: " + contains);

        System.out.println("================================");
        Iterator<String> iterator = cityList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }
        System.out.println("================================");

        for(String cityName: cityList) {
            System.out.println(cityName);
        }

        Collections.sort(cityList, Collections.reverseOrder());

        cityList.sort(Collections.reverseOrder());
        System.out.println(cityList);

        Collections.shuffle(cityList);

        System.out.println("================================");
        System.out.println(cityList);

        cityList.clear();

        System.out.println(cityList);

        List<String> subList = cityList.subList(0,5);
    }

    @Test
    void verifyExample2() {
    }

    @Test
    void verifyExample3() {
    }

    @Test
    void whenExample1() {
    }

    @Test
    void whenExample2() {
    }

}
