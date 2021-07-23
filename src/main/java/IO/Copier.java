package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copier {

    private String path;

    public Copier(String path) {
        this.path = path;
    }

    public void copy(String destinationPath) throws Exception {

        InputStream inputStream = new FileInputStream(path); // "C\\files\\image.png"
        OutputStream outputStream = new FileOutputStream(destinationPath);

        int data;
        while ((data = inputStream.read()) != -1) {
            System.out.print((char)data + " ");
            outputStream.write(data);
        }

        System.out.println( ((FileOutputStream) outputStream).toString() );
        outputStream.flush();

        inputStream.close();
        outputStream.close();
    }
}
