package IO;

import java.io.*;

public class AdvancedReader {

    public static void main(String[] args) { // throws Exception {

        File file = new File("C:\\files\\text.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("could not read");
        }


    }
}
