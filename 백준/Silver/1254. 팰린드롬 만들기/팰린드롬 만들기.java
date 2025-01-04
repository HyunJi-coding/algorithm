import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean isPalindrome = true;
            for (int left = 0, right = n - i - 1; left < right; left++, right--) {
                if (s.charAt(i + left) != s.charAt(i + right)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(n + i);
                return;
            }
        }
    }
}
