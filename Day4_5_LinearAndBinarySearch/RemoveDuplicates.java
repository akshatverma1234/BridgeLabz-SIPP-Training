package Day4_5_LinearAndBinarySearch;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Set<Character> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!s.contains(c)) {
                s.add(c);
                sb.append(c);
            }
        }
        System.out.println("Without duplicates: " + sb.toString());
    }
}
