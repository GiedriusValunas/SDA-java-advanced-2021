package Generics.Barcode;

public class BarCode <T, U> {

    T barcode1;
    U barcode2;

    public BarCode(T barcode1, U barcode2) {
        this.barcode1 = barcode1;
        this.barcode2 = barcode2;
    }

    public void display() {
        System.out.println(barcode1 + "|" + barcode2);
    }

}
