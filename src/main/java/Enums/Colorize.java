package Enums;

public class Colorize {

    public static void main(String[] args) {

        System.out.println("possible colors");
        for (Color possibleColor : Color.values()) {
            System.out.println(possibleColor.name());
        }

        Color color = Color.BLUE;

        switch (color) {
            case BLUE: {
                System.out.println(color.getCode() + "color is blue");
                break;
            }
            case RED: {
                System.out.println(color.getCode() + "color is red");
                break;
            }
            case GREEN: {
                System.out.println(color.getCode() + "color is green");
                break;
            }
        }

    }
}
