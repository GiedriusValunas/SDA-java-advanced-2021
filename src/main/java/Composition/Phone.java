package Composition;

public class Phone {

    private OS os;
    private Battery battery;
    private Hardware hardware;

    public Phone(OS os, Battery battery, Hardware hardware) {
        this.os = os;
        this.battery = battery;
        this.hardware = hardware;
    }

    public void runDiagnostic() {
        os.checkVersion();
        os.checkName();

        battery.checkCharge();

        hardware.checkVersion();
    }

    public OS getOs() {
        return os;
    }

    public Battery getBattery() {
        return battery;
    }

    public Hardware getHardware() {
        return hardware;
    }
}
