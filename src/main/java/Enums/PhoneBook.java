package Enums;

import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        for (CountryCode countyCode: CountryCode.values()) {
            System.out.println(countyCode.name());
        }

        System.out.println("Please select country");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        CountryCode selectedCountry = CountryCode.valueOf(input.toUpperCase());

        System.out.println("please enter telephone number");

        System.out.print(selectedCountry.getCode());
        String telephone = scanner.next();

        System.out.println("your number: " + selectedCountry.getCode() + telephone);
    }
}
