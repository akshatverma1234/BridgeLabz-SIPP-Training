package Day5_Strings;

import java.util.*;
public class CustomSplitCompare {

    public static int getLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < getLength(text); i++) {
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

        for (int i = 0; i < getLength(text); i++) {
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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] builtIn = text.split(" ");
        String[] custom = customSplit(text);
        boolean isEqual = compareArrays(builtIn, custom);
        System.out.println("Are they equal? " + isEqual);
    }
}
