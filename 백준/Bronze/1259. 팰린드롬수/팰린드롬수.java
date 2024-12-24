import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.next();
            if (num.equals("0")) break;

            boolean isPalindrome = true;
            for (int i = 0; i < num.length() / 2; i++) {
                if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println(isPalindrome ? "yes" : "no");
        }
    }
}
