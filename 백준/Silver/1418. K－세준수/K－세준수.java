import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (maxPrimeFactor(i) <= K) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    static int maxPrimeFactor(int n) {
        int maxFactor = 1;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                maxFactor = i;
                n /= i;
            }
        }
        if (n > 1) maxFactor = n;
        return maxFactor;
    }
}
