package Aggregation;

public class Muzzle {

    private int size = 10;
    private String material = "PLASTIC";   // "IRON, PLASTIC"

    public Muzzle ( final int size ) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Muzzle{" +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }

}

