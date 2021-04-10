package Composition;

public class OS {

    private String name;
    private int version;

    public OS(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public void checkVersion() {
        if (version > 7) {
            System.out.println("up to date");
        } else if (version > 3) {
            System.out.println("updates pending");
        } else {
            System.out.println("security risk");
        }
    }

    public void checkName() {
        if (name.equals("android")) {
            System.out.println("cool");
        } else if (name.equals("ios")) {
            System.out.println("ok..");
        } else {
            System.out.println("unknown os");
        }
    }
}
