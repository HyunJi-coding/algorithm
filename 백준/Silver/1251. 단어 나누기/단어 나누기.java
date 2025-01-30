import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = "";

        for (int i = 1; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String part1 = new StringBuilder(s.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(s.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(s.substring(j)).reverse().toString();
                String combined = part1 + part2 + part3;

                if (result.isEmpty() || combined.compareTo(result) < 0) {
                    result = combined;
                }
            }
        }

        System.out.println(result);
    }
}
