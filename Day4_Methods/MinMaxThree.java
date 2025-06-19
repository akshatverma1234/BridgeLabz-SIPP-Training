package Day4_Methods;

import java.util.*;
public class MinMaxThree {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] result = findSmallestAndLargest(x, y, z);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
