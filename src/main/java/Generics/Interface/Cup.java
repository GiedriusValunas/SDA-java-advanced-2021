package Generics.Interface;

public class Cup<T extends Drink> {

    T content;

    Cup(T content) {
        this.content = content;
    }

    public void drink() {
        System.out.println("you are drinking " + content.getName());
    }
}
