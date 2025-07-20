package Day6_Runtime_AnalysisAndBigONotation;

import java.util.*;
public class SearchDataStructureComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = N - 1;

        long start1 = System.nanoTime();
        for (int i = 0; i < N; i++) {
            if (array[i] == target) break;
        }
        long end1 = System.nanoTime();
        System.out.println("Array Search: " + (end1 - start1) / 1_000_000 + " ms");

     
        long start2 = System.nanoTime();
        hashSet.contains(target);
        long end2 = System.nanoTime();
        System.out.println("HashSet Search: " + (end2 - start2) + " ns");

     
        long start3 = System.nanoTime();
        treeSet.contains(target);
        long end3 = System.nanoTime();
        System.out.println("TreeSet Search: " + (end3 - start3) / 1_000_000 + " ms");
    }
}
