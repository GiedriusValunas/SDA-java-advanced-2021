package IO;

public class CopyFile {

    public static void main(String[] args) {


        Copier copier = new Copier("C:\\files\\image.png");

        try {
            copier.copy("C:\\files\\image1.png");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
