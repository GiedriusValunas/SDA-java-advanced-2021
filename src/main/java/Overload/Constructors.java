package Overload;

public class Constructors {

    private int count;
    private String name;

    Constructors() {

    }

    Constructors(int count) {
        //this();
        this.count = count;
        count++;
    }

    Constructors(int count, String name) {
        this(count);
        this.name = name;
    }
}
