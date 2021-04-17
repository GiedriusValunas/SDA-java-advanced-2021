package Inheritance;

public class OfficeWorker extends Worker {

    public OfficeWorker(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    @Override
    public void work() {
        System.out.println("Does " + super.getName() + " work ? no, he is in the meeting.");
    }

}
