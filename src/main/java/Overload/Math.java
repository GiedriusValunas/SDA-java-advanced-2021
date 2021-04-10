package Overload;

public class Math {

    public int add(int num, int num1) {
        return num + num1;
    }

    public int add(int num, int num1, int num2) {
        return add(num, num1) + num2;
    }

    public double add(double num, double num1) {
        return num + num1;
    }

    public float add(float num, float num1) {
        return num + num1;
    }
}
