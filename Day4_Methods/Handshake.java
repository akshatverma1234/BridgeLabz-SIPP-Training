package Day4_Methods;

import java.util.*;

public class Handshake{
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println(maxHandshakes(students));
    }
}
