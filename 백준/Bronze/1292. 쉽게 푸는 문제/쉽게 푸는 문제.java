import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int[] sequence = new int[1000];
        int index = 0, num = 1;

        while (index < 1000) {
            for (int i = 0; i < num && index < 1000; i++) {
                sequence[index++] = num;
            }
            num++;
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += sequence[i];
        }

        System.out.println(sum);
    }
}
