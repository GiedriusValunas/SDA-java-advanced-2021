package Collections.junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.AssertionFailedError;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CitiesTest {

    protected List<String> cityList;

    @BeforeEach
    void fillTestData() {
        cityList = new ArrayList<>();
    }

    @Test
    void verifyExample1() {

        cityList.add("Vilnius");
        cityList.add("Kaunas");
        cityList.add("Prague");

        System.out.println(cityList);

        cityList.add(1, "Barcelona");

        System.out.println("TEST: " + cityList.get(1) );
        assertThrows( AssertionFailedError.class,
           () ->
           assertTrue(
           cityList.get(1).equalsIgnoreCase("athens ")));

        assertDoesNotThrow( () -> {
            assertTrue( cityList.get(1).equalsIgnoreCase("barcelona") );
        });

        assertFalse( cityList.isEmpty() );
        System.out.println(cityList);

        assertTrue( cityList.size() > 2 );
        String city = cityList.get(2);

        System.out.println(city);
        System.out.println("================");

        AtomicInteger size = new AtomicInteger(cityList.size());
        assertTrue( size.get() == 4 );
        System.out.println("array list size: " + size);

        assertDoesNotThrow( () -> {

            cityList.remove("Prague");
            size.set(cityList.size());
            assertTrue(size.get() == 3);
        });

        System.out.println(cityList);
        cityList.remove(0);

        System.out.println(cityList);

        assertDoesNotThrow( () -> {
            int index = cityList.indexOf("Kaunas");
            System.out.println("Kaunas element index is: " + index);

            assertTrue( index == 1 );
        });

        assertDoesNotThrow( new Executable() {
            @Override
            public void execute() throws Throwable {
                int index = cityList.indexOf("Kaunas");
                System.out.println("Kaunas element index is: " + index);

                assertTrue( cityList.contains( "Kaunas" ) );
            }
        });

        cityList.add("Trakai");
        cityList.add("Kaunas");

        assertTrue(
        cityList.stream().filter( ct -> ct.equals( "Kaunas" ) )
                .collect(Collectors.toList()).size() == 2 );

        int lastIndex = cityList.lastIndexOf("Kaunas");
        System.out.println("Last element Kaunas index: " + lastIndex);

        System.out.println(cityList);
        boolean contains = cityList.contains("Trakai");

        System.out.println("Trakai is present in list: " + contains);

        for(String cityName: cityList) {
            System.out.println(cityName);
        }

        System.out.println("=====>>> sorted >>>===============");

        Collections.sort(cityList, Collections.reverseOrder());
        cityList.forEach( System.out::println );

        System.out.println("=====>>> sorted >>>===============");

        cityList.sort(Collections.reverseOrder());
        System.out.println(cityList);

        Collections.shuffle(cityList);

        System.out.println("================================");
        System.out.println(cityList);

        cityList.clear();

        System.out.println(cityList);

        assertThrows( IndexOutOfBoundsException.class , () -> {
            List<String> subList = cityList.subList(0, 5);
            }
        );
    }

    @Test
    void verifyExample2() {

        cityList.add("Palanga");
        cityList.add("Klaipeda");

        System.out.println("================================");
        Iterator<String> iterator = cityList.iterator();

        assertThrows( ConcurrentModificationException.class, () -> {

            while (iterator.hasNext()) {

                try {
                System.out.println(iterator.next());
                    cityList.clear();
                }
                catch (Throwable th) {
                    th.printStackTrace();
                    throw th;
                }
            }

            System.out.println("================================");
        });
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
