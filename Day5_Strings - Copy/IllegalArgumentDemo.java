package Day5_Strings;

import java.util.*;
public class IllegalArgumentDemo {
    public static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println(sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (Exception e) {}

        handleException(text);
    }
}
