package Day5_Strings;

import java.util.*;

public class StringIndexExcep{
    public static void generateException(String text) {
        System.out.println(text.charAt(100));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
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
