package SolarSystem;

public enum Planets {

    MERCURY("Small", 1000_000L),
    VENUS("Small", 2000_000L),
    EARTH("Small", 0L),
    MARS("Small", 3000_000L),
    JUPITER("Huge", 4000_000L),
    SATURN("Huge", 5000_000L),
    URANUS("Huge", 6000_000L),
    NEPTUNE("Huge", 7000_000L);

    private String size;
    private long distanceFromEarth;

    Planets(String size, long distanceFromEarth) {
        this.size = size;
        this.distanceFromEarth = distanceFromEarth;
    }

    long distanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return size + " " + this.name();
    }
}