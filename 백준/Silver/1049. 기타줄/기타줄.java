import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int minPackage = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            int packagePrice = sc.nextInt();
            int singlePrice = sc.nextInt();

            minPackage = Math.min(minPackage, packagePrice);
            minSingle = Math.min(minSingle, singlePrice);
        }

        int cost1 = ((N / 6) + 1) * minPackage;

        int cost2 = (N / 6) * minPackage + (N % 6) * minSingle;

        int cost3 = N * minSingle;

        int result = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(result);
    }
}
