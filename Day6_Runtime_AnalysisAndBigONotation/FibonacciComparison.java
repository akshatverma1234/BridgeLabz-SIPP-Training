package Day6_Runtime_AnalysisAndBigONotation;

public class FibonacciComparison {
    public static int recursiveFib(int n) {
        if (n <= 1) return n;
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    public static int iterativeFib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;
        long start1 = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveFib(n));
        long end1 = System.nanoTime();
        System.out.println("Recursive Time: " + (end1 - start1) / 1_000_000 + " ms");

        long start2 = System.nanoTime();
        System.out.println("Iterative Result: " + iterativeFib(n));
        long end2 = System.nanoTime();
        System.out.println("Iterative Time: " + (end2 - start2) / 1_000_000 + " ms");
    }
}
