package Generics.Collections;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) list.add(sc.nextInt());
        List<Integer> rev = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--) rev.add(list.get(i));
        System.out.println("Reversed: " + rev);
    }
}
