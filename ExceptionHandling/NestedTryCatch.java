package Generics.ExceptionHandling;

public class NestedTryCatch{
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        int index = 2;
        int divisor = 0;

        try {
            try {
                int value = arr[index];
                System.out.println("Value: " + value);
                System.out.println("Result: " + (value / divisor));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
