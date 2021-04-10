package Composition;

public class Battery {

    private int charge;

    public Battery(int charge) {
        this.charge = charge;
    }

    public void checkCharge() {
        if (charge > 95) {
            System.out.println("full battery");
        } else if (charge > 20) {
            System.out.println("battery good");
        } else {
            System.out.println("low battery");
        }
    }

    public void increaseCharge() {
        charge++;
    }

    public void decreaseCharge(){
        charge--;
    }
}
