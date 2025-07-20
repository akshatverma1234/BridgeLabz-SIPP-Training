package Day6_Runtime_AnalysisAndBigONotation;

public class StringConcatComparison {
    public static void main(String[] args) {
        int N = 10_000;


        long start1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) s += "a";
        long end1 = System.nanoTime();
        System.out.println("String: " + (end1 - start1) / 1_000_000 + " ms");
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");
        long end2 = System.nanoTime();
        System.out.println("StringBuilder: " + (end2 - start2) / 1_000_000 + " ms");

        
        long start3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("a");
        long end3 = System.nanoTime();
        System.out.println("StringBuffer: " + (end3 - start3) / 1_000_000 + " ms");
    }
}
