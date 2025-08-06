package Generics.Streams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String source = "lf.txt";
        String dest = "cf.txt";
        byte[] buffer = new byte[4096];

        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Buffered : " + (end - start) / 1e6 + " ms");
    }
}

