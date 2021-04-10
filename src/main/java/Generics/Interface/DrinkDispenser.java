package Generics.Interface;

public class DrinkDispenser {

    public static void main(String[] args) {

        Cup<Cola> cup = new Cup<>(new Cola());

        cup.drink();
    }
}
