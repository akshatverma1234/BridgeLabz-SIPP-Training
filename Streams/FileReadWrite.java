package Generics.Streams;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("text.txt");
             FileOutputStream fos = new FileOutputStream("dest.txt")) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
