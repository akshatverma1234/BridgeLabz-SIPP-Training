package Generics.Collections;

import java.util.*;

public class BinaryNumbersQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for(int i=0;i<n;i++) {
            String curr = queue.poll();
            System.out.print(curr + " ");
            queue.add(curr + "0");
            queue.add(curr + "1");
        }
    }
}

