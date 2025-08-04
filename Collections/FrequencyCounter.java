package Generics.Collections;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter number of words:");
        int n = sc.nextInt();
        System.out.println("Enter words:");
        for(int i=0;i<n;i++) list.add(sc.next());
        Map<String,Integer> freq = new HashMap<>();
        for(String s:list) freq.put(s,freq.getOrDefault(s,0)+1);
        System.out.println("Frequencies: " + freq);
    }
}
