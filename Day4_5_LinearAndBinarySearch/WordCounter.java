package Day4_5_LinearAndBinarySearch;

import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        String target = "java";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("random.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
            System.out.println("Word '" + target + "' found " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
