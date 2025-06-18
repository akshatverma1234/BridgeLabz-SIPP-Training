package Day3_Arrays;

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter data for person " + (i + 1));

            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();
            if (weight <= 0) {
                i--;
                continue;
            }

            System.out.print("Height (m): ");
            double height = sc.nextDouble();
            if (height <= 0) {
                i--;
                continue;
            }

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println();
        System.out.println("Height  Weight  BMI       Status");

        for (int i = 0; i < number; i++) {
            System.out.print(personData[i][0] + "     ");
            System.out.print(personData[i][1] + "     ");
            System.out.print(personData[i][2] + "     ");
            System.out.println(weightStatus[i]);
        }
    }
}
