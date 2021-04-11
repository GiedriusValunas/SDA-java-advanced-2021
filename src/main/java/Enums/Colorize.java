package Enums;

public class Colorize {

    public static void main(String[] args) {

        System.out.println("possible colors");
        for (Color possibleColor : Color.values()) {
            System.out.println(possibleColor.name());
        }

        for (Color color : Color.values()) {

            switch (color) {

                case BLUE:
                case YELLOW:
                case RED:
                case GREEN:
                    System.out.println(color.getCode() + "color is " +
                            color.toString().toLowerCase());
                    break;

                case RESET:
                    break;
            }
        }
    }
}
