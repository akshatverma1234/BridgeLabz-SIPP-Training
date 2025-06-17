package Day2_ControlFlow;

import java.util.*;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), fact = 1, i = 1;
        if (num >= 0) {
            while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial: " + fact);
        }
    }
}

