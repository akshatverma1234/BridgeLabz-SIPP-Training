package Generics.Streams;

import java.io.*;
import java.nio.file.*;

public class ImageByteArray {
    public static void main(String[] args) {
        try {
            byte[] imageBytes = Files.readAllBytes(Paths.get("input.jpg"));
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int data;
            while ((data = bais.read()) != -1) baos.write(data);
            Files.write(Paths.get("output.jpg"), baos.toByteArray());
            System.out.println("Image copied successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }
}
