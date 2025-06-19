package Day5_Strings;

import java.util.*;

public class TrimSpaces{
    public static int[] getTrimBounds(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') {
        	start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
        	end--;
        }
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String txt, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
        	result += txt.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
        	return false;
        }
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) {
        	return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] bounds = getTrimBounds(text);
        String custom = customSubstring(text, bounds[0], bounds[1]);
        String builtIn = text.trim();
        boolean isSame = compareStrings(custom, builtIn);
        System.out.println("Trimmed: " + custom);
        System.out.println("Matches built-in: " + isSame);
    }
}
