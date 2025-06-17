package Day2_ControlFlow;

import java.util.*;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), power = sc.nextInt(), result = 1, i = 0;
        while (i < power) {
            result *= number;
            i++;
        }
        System.out.println(result);
    }
}

