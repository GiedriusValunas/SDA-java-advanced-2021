package Generics.Barcode;

public class BarcodeScanner {

    public static void main(String[] args) {

        BarCode barCode = new BarCode(1002, "k75j");

        barCode.display();

        BarCode newBarCode = new BarCode("k75j", 1002);

        newBarCode.display();
    }
}
