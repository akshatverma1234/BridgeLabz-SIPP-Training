package Day5_Strings;

import java.util.*;

public class NumberFormat{
    public static void generateException(String txt) {
    	
        int num = Integer.parseInt(txt);
        System.out.println(num);
    }

    public static void handleException(String txt) {
        try {
            int number = Integer.parseInt(txt);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();

        try {
            generateException(str);
        } catch (Exception e) {}

        handleException(str);
    }
}
