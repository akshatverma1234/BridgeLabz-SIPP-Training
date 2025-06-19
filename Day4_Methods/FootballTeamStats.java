package Day4_Methods;

import java.util.*;

public class FootballTeamStats {
    public static int sum(int[] arr) {
        int s = 0;
        for (int val : arr) s += val;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
    }
}
