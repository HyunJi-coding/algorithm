import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] numbers = new long[t];

        for (int i = 0; i < t; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }

        for (long num : numbers) {
            boolean isSafe = true;
            for (int i = 2; i <= 1000000; i++) {
                if (num % i == 0) {
                    isSafe = false;
                    break;
                }
            }
            sb.append(isSafe ? "YES\n" : "NO\n");
        }

        System.out.print(sb);
    }
}
