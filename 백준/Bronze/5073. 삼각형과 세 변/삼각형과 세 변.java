import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c));
            int sumOfOthers = a + b + c - max;

            if (sumOfOthers <= max) {
                System.out.println("Invalid");
            } else {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
