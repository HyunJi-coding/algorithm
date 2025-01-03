import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 0, sum = 0, count = 0;

        while (right < n) {
            sum += arr[right++];

            while (sum > m && left < right) {
                sum -= arr[left++];
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println(count);
    }
}
