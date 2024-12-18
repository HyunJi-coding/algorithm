import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next(); 
        int B = scanner.nextInt(); 

        int decimalValue = Integer.parseInt(N, B);

        System.out.println(decimalValue);
    }
}
