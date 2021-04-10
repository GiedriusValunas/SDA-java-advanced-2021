package Exceptions;

public class Child {

    private int age;

    public Child() {
        age = 1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < this.age) {
            throw new InvalidAgeException("humans don't grow backwards");
        }
        this.age = age;
    }
}
