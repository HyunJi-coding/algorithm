import java.util.*;

public class Main {
    static int N, M;
    static int[][] A, B;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N][M];
        B = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                A[i][j] = row.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                B[i][j] = row.charAt(j) - '0';
            }
        }

        int count = 0;
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= M - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    flip(i, j);
                    count++;
                }
            }
        }

        System.out.println(Arrays.deepEquals(A, B) ? count : -1);
    }

    static void flip(int x, int y) {
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                A[i][j] ^= 1;
            }
        }
    }
}
