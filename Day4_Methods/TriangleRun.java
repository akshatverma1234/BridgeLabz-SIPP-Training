package Day4_Methods;

import java.util.*;
public class TriangleRun {
    public static int findRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println(findRounds(side1, side2, side3));
    }
}

