package Generics.Collections;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter size of Set1:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set1:");
        for(int i=0;i<n1;i++) set1.add(sc.nextInt());
        System.out.println("Enter size of Set2:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set2:");
        for(int i=0;i<n2;i++) set2.add(sc.nextInt());
        Set<Integer> diff = new HashSet<>(set1);
        diff.addAll(set2);
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        diff.removeAll(common);
        System.out.println("Symmetric Difference: " + diff);
    }
}
