package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;

public class LongestConsecutive {
    public static int findLongestSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        int longest = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (numSet.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {232,4,5,2,56,7,8};
        System.out.println("Longest consecutive length: " + findLongestSequence(arr)); 
    }
}
