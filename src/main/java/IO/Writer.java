package IO;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("C:\\files\\text.txt")) {

            String text = "File content to write";

            fileWriter.write(text);

            String moreText = " Added text in second writing";

            fileWriter.append(moreText);

        } catch (IOException e) {
            System.out.println("could not write");
        }
    }
}
