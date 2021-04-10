package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdvancedWriter {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("C:\\files\\text.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("This text is for buffered writing ");

            bufferedWriter.append("This text was appended");

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("could not write");
        }
    }
}
