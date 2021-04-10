package Encapsullation;

class Product {

    private String name;
    private float unitPrice;

    private int unitCount;
    private float totalPrice;

    // Default constructor is public
    // " @Override "
    protected Product() {
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("invalid name");
        } else {
            this.name = name;
        }
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float price) {
        unitPrice = price;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int count) {
        unitCount = count;
    }

    public void calculateTotalPrice() {
        totalPrice = unitPrice * unitCount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

}
