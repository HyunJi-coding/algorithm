import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int[][] arr = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(row[j - 1]);
            }
        }

        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int q = 0; q < k; q++) {
            String[] query = br.readLine().split(" ");
            int i1 = Integer.parseInt(query[0]);
            int j1 = Integer.parseInt(query[1]);
            int i2 = Integer.parseInt(query[2]);
            int j2 = Integer.parseInt(query[3]);

            int sum = 0;
            for (int i = i1; i <= i2; i++) {
                for (int j = j1; j <= j2; j++) {
                    sum += arr[i][j];
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
