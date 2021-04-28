package IO;

public class CopyFile {

    public static void main(String[] args) {

        Copier copier = new Copier("/home/adminas/workspace/java-advanced-2021/files/results.txt");  //source

        try {
            copier.copy("/home/adminas/workspace/java-advanced-2021/files/copied.txt");   //destination

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
