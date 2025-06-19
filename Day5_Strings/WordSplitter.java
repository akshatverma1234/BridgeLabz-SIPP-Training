package Day5_Strings;

import java.util.*;
public class WordSplitter {
    public static String[] splitWords(String txt) {
        List<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) list.add(word);
        String[] words = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            words[i] = list.get(i);
        }
        return words;
    }

    public static int findLength(String word) {
    	int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = getWordLengths(words);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + Integer.parseInt(result[i][1]));
        }
    }
}

