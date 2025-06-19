package Day5_Strings;

import java.util.*;

public class VowelConsonantCounter {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
        	ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            	return "Vowel";
            }
            return "Consonant";
        }
        return "NotLetter";
    }

    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = checkChar(text.charAt(i));
            if (type.equals("Vowel")) {
            	vowels++;
            }
            else if (type.equals("Consonant")) {
            	consonants++;
            }
        }
        return new int[] {vowels,consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String input = sc.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Total No. of Vowels: " + result[0]);
        System.out.println("Total No. of Consonants: " + result[1]);
    }
}
