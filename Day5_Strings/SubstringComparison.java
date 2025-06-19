package Day5_Strings;

import java.util.*;

public class SubstringComparison {
    public static String customSubstring(String txt, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += txt.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) { return false;
        
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
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending index: ");
        int end = sc.nextInt();

        String custom = customSubstring(str, start, end);
        String builtIn = str.substring(start, end);
        boolean result = compareStrings(custom, builtIn);

        System.out.println("Custom Substring: " + custom);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Are Equal: " + result);
    }
}
