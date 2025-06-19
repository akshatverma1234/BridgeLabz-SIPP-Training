package Day5_Strings;

import java.util.*;
public class VotingEligibility {
    public static int[] generateAges(int number) {
        int[] ages = new int[number];
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            ages[i] = rand.nextInt(90);
        }
        return ages;
    }
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void display(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] ages = generateAges(number);
        String[][] result = checkEligibility(ages);
        display(result);
    }
}

