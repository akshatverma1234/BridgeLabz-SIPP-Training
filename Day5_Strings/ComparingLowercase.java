package Day5_Strings;

import java.util.*;
public class ComparingLowercase {
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
        	return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
            	return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String custom = convertToLower(text);
        String builtIn = text.toLowerCase();

        boolean result = compareStrings(custom, builtIn);

        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Are Equal: " + result);
    }
}
