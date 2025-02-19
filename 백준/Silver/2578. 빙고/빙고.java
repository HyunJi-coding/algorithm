import java.util.Scanner;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] marked = new boolean[5][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int call = 1; call <= 25; call++) {
            int num = sc.nextInt();
            markNumber(num);

            if (countBingo() >= 3) {
                System.out.println(call);
                break;
            }
        }

        sc.close();
    }

    static void markNumber(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == num) {
                    marked[i][j] = true;
                    return;
                }
            }
        }
    }

    static int countBingo() {
        int count = 0;

        for (int i = 0; i < 5; i++) {
            if (isBingo(marked[i])) count++;
        }

        for (int j = 0; j < 5; j++) {
            boolean[] col = new boolean[5];
            for (int i = 0; i < 5; i++) {
                col[i] = marked[i][j];
            }
            if (isBingo(col)) count++;
        }

        boolean[] diag1 = new boolean[5];
        boolean[] diag2 = new boolean[5];
        for (int i = 0; i < 5; i++) {
            diag1[i] = marked[i][i];
            diag2[i] = marked[i][4 - i];
        }
        if (isBingo(diag1)) count++;
        if (isBingo(diag2)) count++;

        return count;
    }

    static boolean isBingo(boolean[] line) {
        for (boolean b : line) {
            if (!b) return false;
        }
        return true;
    }
}
