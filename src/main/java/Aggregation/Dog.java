package Aggregation;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    // Composition or Aggregation of Class
    protected Muzzle muzzle;

    // here we create constructor
    public Dog(int age, double weight) {
        this.setAge(age);
        if (weight <= 0) {
            System.out.println("Invalid weight");
        } else {
            this.weight = weight;
        }
    }

    public Dog(String race, String gender) {
        this.setRace(race);
        this.gender = gender;
    }

    public Dog(int age, double weight, final Muzzle muzzle) {
        this.setRace(race);
        this.setMuzzle( muzzle );
        this.setAge(age);
        this.gender = gender;
    }

    //creating getters
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getRace() {
        return race;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(final Muzzle muzzle) {
        this.muzzle = muzzle;
    }

}