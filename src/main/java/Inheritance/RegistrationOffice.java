package Inheritance;

public class RegistrationOffice {

    public static void main(String[] args) {

        Human human = new Human();

        human.move();

        System.out.println("================================");

        Worker worker = new Worker("John","0000000001");

        worker.move();

        worker.work();

        System.out.println("================================");

        Human smith = new Worker("Smith", "000000000002");

        smith.move();

        if(smith instanceof Worker) {

            ((Worker)smith).work();

        }
    }
}
