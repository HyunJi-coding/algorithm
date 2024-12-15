import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        System.out.println(longestPalindromeLength(s));
    }

    public static int longestPalindromeLength(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (char c : s.toCharArray()) {
            sb.append(c).append("#");
        }
        String modified = sb.toString();

        int n = modified.length();
        int[] p = new int[n]; 
        int center = 0, right = 0; 
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            if (i < right) {
                p[i] = Math.min(right - i, p[2 * center - i]);
            }

            while (i - p[i] - 1 >= 0 && i + p[i] + 1 < n
                    && modified.charAt(i - p[i] - 1) == modified.charAt(i + p[i] + 1)) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            maxLen = Math.max(maxLen, p[i]);
        }

        return maxLen; 
    }
}
