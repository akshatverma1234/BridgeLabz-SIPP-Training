package Day3_Arrays;

import java.util.*;

public class NumberTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int n : numbers) {
            if (n > 0) {
                if (n % 2 == 0) {
                	System.out.println(n + " is positive and even");
                }
                else {System.out.println(n + " is positive and odd");
                
                }
            } else if (n < 0) {
            	System.out.println(n + " is negative");
            }
            else { System.out.println("Zero");
            
            }
        }
        if (numbers[0] == numbers[4]) {
        	System.out.println("First and last are equal");
        }
        else if (numbers[0] > numbers[4]) {
        	System.out.println("First is greater than last");
        	}
        else {
        	System.out.println("First is less than last");
        }
    }
}

