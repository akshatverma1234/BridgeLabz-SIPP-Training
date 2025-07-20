package Day3_SortingAlgorithms;

import java.util.*;

public class StudentAges {
    public static void countingSort(int[] ages) {
        int max = 18, min = 10;
        int[] count = new int[max - min + 1];
        for (int age : ages) count[age - min]++;

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[idx++] = i + min;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter ages (10 to 18):");
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();

        countingSort(ages);

        System.out.println("Sorted Ages:");
        System.out.println(Arrays.toString(ages));
    }
}
