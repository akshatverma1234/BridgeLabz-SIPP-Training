package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;

public class StockSpan {

    public static void calculateSpan(int[] prices, int n, int[] span) {
        Stack<Integer> idx = new Stack<>();
        idx.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!idx.isEmpty() && prices[i] >= prices[idx.peek()]) {
                idx.pop();
            }
            span[i] = (idx.isEmpty()) ? (i + 1) : (i - idx.peek());
            idx.push(i);
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        int[] span = new int[n];
        calculateSpan(prices, n, span);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

