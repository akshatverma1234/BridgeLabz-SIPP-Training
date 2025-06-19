package Day4_Methods;

import java.util.*;

public class NumberCheckerFourth {
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        int num = 0;
        for (int d : digits) num = num * 10 + d;
        return sum == num;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = storeDigits(num);
        System.out.println(isDuckNumber(digits));
        System.out.println(isArmstrong(digits));
        System.out.println(Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println(Arrays.toString(smallestAndSecondSmallest(digits)));
    }
}

