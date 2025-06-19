package Day5_Strings;

import java.util.*;

public class TextLengthAnalyzer{

    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    words[index] = word;
                    index++;
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    public static int getStringLength(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static String[] getShortestLongest(String[][] wordData) {
        String shortest = wordData[0][0];
        String longest = wordData[0][0];
        int min = Integer.parseInt(wordData[0][1]);
        int max = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < min) {
                min = len;
                shortest = wordData[i][0];
            }
            if (len > max) {
                max = len;
                longest = wordData[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = sc.nextLine();
        String[] words = splitTextIntoWords(text);
        String[][] data = getWordLengthArray(words);
        String[] result = getShortestLongest(data);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
