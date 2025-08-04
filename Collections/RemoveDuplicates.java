package Generics.Collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) list.add(sc.nextInt());
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("Without duplicates: " + new ArrayList<>(set));
    }
}
