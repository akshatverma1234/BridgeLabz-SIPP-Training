package Day6_Runtime_AnalysisAndBigONotation;
import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int[] data = new int[1_000_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        int target = 999_999;
        long startLinear = System.nanoTime();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) break;
        }
        long endLinear = System.nanoTime();
        System.out.println("Linear Search Time: " + (endLinear - startLinear) / 1_000_000 + " ms");
        long startBinary = System.nanoTime();
        int index = Arrays.binarySearch(data, target);
        long endBinary = System.nanoTime();
        System.out.println("Binary Search Time: " + (endBinary - startBinary) / 1_000_000 + " ms");
    }
}

