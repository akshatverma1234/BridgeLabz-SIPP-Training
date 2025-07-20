package Day6_Runtime_AnalysisAndBigONotation;

import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) throws IOException {
        String filePath = "random.txt";

 
        long start1 = System.nanoTime();
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        while (fileReader.readLine() != null) {}
        fileReader.close();
        long end1 = System.nanoTime();
        System.out.println("FileReader Time: " + (end1 - start1) / 1_000_000 + " ms");

       
        long start2 = System.nanoTime();
        BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
        while (inputStreamReader.readLine() != null) {}
        inputStreamReader.close();
        long end2 = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end2 - start2) / 1_000_000 + " ms");
    }
}
