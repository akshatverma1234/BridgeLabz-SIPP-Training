package Day6_Runtime_AnalysisAndBigONotation;

import java.util.*;

public class SortingComparison {
    public static void main(String[] args) {
        int[] original = new Random().ints(10_000).toArray();
        int[] bubbleArray = original.clone();
        long startBubble = System.nanoTime();
        bubbleSort(bubbleArray);
        long endBubble = System.nanoTime();
        System.out.println("Bubble Sort: " + (endBubble - startBubble) / 1_000_000 + " ms");

        int[] mergeArray = original.clone();
        long startMerge = System.nanoTime();
        Arrays.sort(mergeArray); 
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort (Arrays.sort): " + (endMerge - startMerge) / 1_000_000 + " ms");

        int[] quickArray = original.clone();
        long startQuick = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort: " + (endQuick - startQuick) / 1_000_000 + " ms");
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
