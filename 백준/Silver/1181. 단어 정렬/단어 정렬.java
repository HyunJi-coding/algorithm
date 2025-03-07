import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort((a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());

        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
