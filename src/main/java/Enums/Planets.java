package Enums;

enum Planets {

    VENUS("medium"),
    EARTH("medium"),
    MARS("medium"),
    JUPITER("huge"),
    PLUTO("dwarf");

    private String size;
    private String name;

    Planets(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}

class Planet {

    public static void main(String[] args) {

        for (Planets choice : Planets.values()) {
            switch (choice) {
                case MARS:
                case PLUTO:
                case VENUS:
                case JUPITER:
                    System.out.println(choice.name() + " distance from earth:" + distance(choice) + " million km");
                    break;
                case EARTH:
                    System.out.println("We are on " + choice.name());
                    break;
                default:
                    System.out.println("unknown");
            }
        }
    }

    public static int distance(Planets planet) {
        switch (planet) {
            case JUPITER:
                return 831;
            case VENUS:
                return 257;
            case PLUTO:
                return 7500;
            case EARTH:
                return 0;
            case MARS:
                return 277;
            default:
                return -1;
        }
    }
}