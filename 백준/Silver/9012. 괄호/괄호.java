import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); 
        scanner.nextLine(); 
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String ps = scanner.nextLine();
            result.append(isVPS(ps) ? "YES" : "NO").append("\n");
        }

        System.out.println(result);
    }

    public static boolean isVPS(String ps) {
        int balance = 0; 

        for (char c : ps.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) { 
                    return false;
                }
            }
        }

        return balance == 0; 
    }
}
