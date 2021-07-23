package IO;

public class CopyFile {

    public static void main(String[] args) {

        Copier copier = new Copier("./files/results.txt");  //source

        try {
            copier.copy("./files/copied.txt");   //destination

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
