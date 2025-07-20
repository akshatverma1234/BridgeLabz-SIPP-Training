package Day4_5_LinearAndBinarySearch;

public class SearchWordInSentences {
    public static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] lines = {"I love Java", "React is nice", "JavaScript is awesome"};
        System.out.println(searchWord(lines, "React"));  
    }
}
