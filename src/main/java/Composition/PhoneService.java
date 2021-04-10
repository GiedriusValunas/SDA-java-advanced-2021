package Composition;

public class PhoneService {

    public static void main(String[] args) {

        Phone phone = new Phone(
                new OS("android",8),
                new Battery(7),
                new Hardware(6));

        phone.runDiagnostic();

        Battery battery = phone.getBattery();

        battery.decreaseCharge();
    }
}
