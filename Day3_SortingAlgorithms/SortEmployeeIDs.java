package Day3_SortingAlgorithms;

import java.util.*;

public class SortEmployeeIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] empIDs = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIDs[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
            empIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        System.out.println(Arrays.toString(empIDs));
    }
}
