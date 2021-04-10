package Encapsullation;

public class Shop {

    public static void main(String[] args) {

        Product product = new Product();

//        product.name = "milk";
        product.setName("");
//        product.unitPrice = 2;
        product.setUnitPrice(2);

        System.out.println(product.getName());
        System.out.println(product.getUnitPrice());

//        product.unitCount = 10;


    }
}
