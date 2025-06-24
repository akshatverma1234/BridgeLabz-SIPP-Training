package Day6_Class_and_Objects.Level2;

import java.util.*;

public class PalindromeChecker {
    public String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
    }
}
