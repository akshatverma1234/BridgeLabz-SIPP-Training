package Day3_Arrays;

import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            number = -number;
        }
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int[] digits = new int[count];
        int[] frequency = new int[10];
        temp = number;
        int index = 0;
        while (temp > 0) {
            int digit = temp % 10;
            digits[index] = digit;
            frequency[digit]++;
            temp = temp / 10;
            index++;
        }
        System.out.println("Digit frequencies in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
