import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] paper = new boolean[100][100];
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int row = x; row < x + 10; row++) {
                for (int col = y; col < y + 10; col++) {
                    paper[row][col] = true;
                }
            }
        }
        scanner.close();

        int blackArea = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    blackArea++;
                }
            }
        }

        System.out.println(blackArea);
    }
}