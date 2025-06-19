package Day4_Methods;

import java.util.*;
public class FactorAnalysis {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
        	if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
        	if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
        	sum += f;
        }
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
        	product *= f;
        }
        return product;
    }

    public static int sumOfSquares(int[] factors) {
        int square = 0;
        for (int f : factors) {
        	square += Math.pow(f, 2);
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
