package Day4_Methods;

import java.util.Scanner;

public class NumberCheckerSecond {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
        System.out.println(isAbundant(n));
        System.out.println(isDeficient(n));
        System.out.println(isStrong(n));
    }
}
