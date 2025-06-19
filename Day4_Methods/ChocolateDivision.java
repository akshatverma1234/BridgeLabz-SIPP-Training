package Day4_Methods;

import java.util.*;
public class ChocolateDivision {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates: ");
        int numberOfchocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
        System.out.println("Each gets: " + result[0]);
        System.out.println("Remaining: " + result[1]);
    }
}
