import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        double mean = Arrays.stream(numbers).average().orElse(0);
        Arrays.sort(numbers);
        int median = numbers[N / 2];

        int[] freq = new int[8001];
        for (int num : numbers) {
            freq[num + 4000]++;
        }

        int maxFreq = 0;
        int mode = 0;
        boolean secondMode = false;
        for (int i = 0; i < 8001; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mode = i - 4000;
                secondMode = false;
            } else if (freq[i] == maxFreq && !secondMode) {
                mode = i - 4000;
                secondMode = true;
            }
        }

        int range = numbers[N - 1] - numbers[0];

        System.out.println(Math.round(mean));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
