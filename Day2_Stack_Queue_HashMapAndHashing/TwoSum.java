package Day2_Stack_Queue_HashMapAndHashing;
import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; 
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[] arr = {4,5,7,8,2};
        int target = 6;
        int[] result = findTwoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

