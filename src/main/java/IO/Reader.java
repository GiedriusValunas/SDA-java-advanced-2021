package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {

        try {
            //FileReader reader = new FileReader("./files/results.txt");
            FileReader reader = new FileReader( "./files/results.txt");

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char)data + " ");
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("failed to read");
        }

    }
}
