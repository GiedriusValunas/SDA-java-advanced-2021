package NewIO;

import Streams.Phone;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NewIOBuffered {

    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(8);

        String text = "sda";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }

        System.out.println("Position after data is written into buffer: " +
                Arrays.toString( buffer.array()) );

        Path path = Paths.get("./files/pathsdemo.txt");

        try {
            Files.createFile(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(path, "[4] A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
            Files.write(path, "[1] in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
            Files.write(path, "[2] far away..\n".getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> allFile = new LinkedList<>();
        try {
            for (String line : Files.readAllLines(path)) {

                System.out.println( line );
                allFile.add( line );
            }

            Files.delete(path);

            Collections.sort( allFile );
            allFile.stream().forEach( System.out::println );

        } catch (IOException e) {
            e.printStackTrace();
        }

        Phone phone = new Phone( "iPhone-11", 900 );

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream( "./files/serialized.txt" );
            ObjectOutputStream out = new ObjectOutputStream( file );

            // Method for serialization of object
            out.writeObject( phone );

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        Object phone11;
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream( "./files/serialized.txt" );
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            phone11 = (Phone)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("phone : " + phone11.toString() + " costs: " + ((Phone) phone11).getPrice() );
            System.out.println("discount : " + ((Phone) phone11).giveDiscount( 20 ) );
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }



        // R P C remote procedure call

    }

}
