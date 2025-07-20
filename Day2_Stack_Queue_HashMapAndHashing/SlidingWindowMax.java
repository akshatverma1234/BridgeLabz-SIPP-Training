package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;

public class SlidingWindowMax {
    public static void maxInSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                System.out.print(nums[deque.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;

        maxInSlidingWindow(nums, windowSize);
    }
}
