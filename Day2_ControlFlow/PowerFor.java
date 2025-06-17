package Day2_ControlFlow;

import java.util.*;
public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), power = sc.nextInt(), result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
    }
}

