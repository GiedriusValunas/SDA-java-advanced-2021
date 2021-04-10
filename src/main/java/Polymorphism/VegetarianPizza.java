package Polymorphism;

public class VegetarianPizza extends Pizza {

    public VegetarianPizza(int diameter) {
        super(diameter, "vegetarian");
    }

    @Override
    public void bake() {

        System.out.println(" For vegetarian pizzas we do not use garlic " );
        super.bake();

    }
}
