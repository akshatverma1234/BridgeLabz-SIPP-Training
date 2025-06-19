package Day5_Strings;

import java.util.*;
public class StringLengthFinder {
    public static int customLength(String text) {
    	int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int custom = customLength(input);
        int builtIn = input.length();
        System.out.println("Custom Length: " + custom);
        System.out.println("Built-in Length: " + builtIn);
    }
}

