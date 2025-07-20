package Day4_5_LinearAndBinarySearch;

import java.util.*;
public class LinearBinaryChallenge {
    public static int findMissingPositive(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) present[num] = true;
        }
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) return i;
        }
        return nums.length + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,2,6};
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        System.out.println("First missing positive: " + findMissingPositive(nums));
        System.out.println("Index of 4: " + binarySearch(sorted, 4));
    }
}
