package Day4_Methods;

import java.util.*;

public class NumberCheckerThird {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] rev = reverseDigits(digits);
        return Arrays.equals(digits, rev);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = storeDigits(num);
        System.out.println(isPalindrome(digits));
        System.out.println(isDuckNumber(digits));
    }
}
