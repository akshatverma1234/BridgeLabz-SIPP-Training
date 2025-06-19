package Day5_Strings;

import java.util.*;

public class ArrayIndexOutOfBounds{
    public static void generateException(String[] names, int index) {
        System.out.println(names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        int index = sc.nextInt();

        try {
            generateException(names, index);
        } catch (Exception e) {}

        handleException(names, index);
    }
}
