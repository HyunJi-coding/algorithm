import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = row.charAt(j) - '0';
            }
        }

        int maxSize = 1;
        for (int size = 1; size < Math.min(n, m); size++) {
            for (int i = 0; i + size < n; i++) {
                for (int j = 0; j + size < m; j++) {
                    if (grid[i][j] == grid[i][j + size] && grid[i][j] == grid[i + size][j] && grid[i][j] == grid[i + size][j + size]) {
                        maxSize = Math.max(maxSize, size + 1);
                    }
                }
            }
        }

        System.out.println(maxSize * maxSize);
    }
}
