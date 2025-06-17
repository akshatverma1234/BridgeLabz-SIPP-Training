package Day2_ControlFlow;

import java.util.*;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        }
    }
}

