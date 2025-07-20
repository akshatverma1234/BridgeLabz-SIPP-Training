package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;
public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumIndices = new HashMap<>();
        int sum = 0;

        sumIndices.put(0, new ArrayList<>());
        sumIndices.get(0).add(-1); 

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumIndices.containsKey(sum)) {
                for (int start : sumIndices.get(sum)) {
                    System.out.println("Subarray: [" + (start + 1) + " to " + i + "]");
                }
            }
            sumIndices.putIfAbsent(sum, new ArrayList<>());
            sumIndices.get(sum).add(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}

