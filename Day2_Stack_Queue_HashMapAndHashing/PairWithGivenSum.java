package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;
public class PairWithGivenSum {
    public static boolean pairSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int needed = target - num;
            if (seen.contains(needed)) {
                System.out.println("Pair found: " + num + " + " + needed + " = " + target);
                return true;
            }
            seen.add(num);
        }
        System.out.println("No pair found.");
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3, 6};
        int target = 8;
        pairSum(arr, target);
    }
}
