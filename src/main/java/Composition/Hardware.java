package Composition;

public class Hardware {

    private int version;

    public Hardware(int version) {
        this.version = version;
    }

    public void checkVersion() {
        if (version > 10) {
            System.out.println("up to date");
        } else if (version > 3) {
            System.out.println("device is old");
        } else {
            System.out.println("not maintained");
        }
    }
}
