import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int L = scanner.nextInt(); 

        for (int length = L; length <= 100; length++) { 
            int temp = N - (length * (length - 1)) / 2;
            if (temp < 0) break; 

            if (temp % length == 0) { 
                int start = temp / length;
                if (start >= 0) {
                    for (int i = 0; i < length; i++) {
                        System.out.print((start + i) + " ");
                    }
                    return;
                }
            }
        }
        System.out.println("-1"); 
    }
}
