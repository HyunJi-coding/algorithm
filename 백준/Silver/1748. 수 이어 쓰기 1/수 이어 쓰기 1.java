import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int length = 0; 
        int digit = 1;  
        int start = 1;  

        while (start <= N) {
            int end = Math.min(N, start * 10 - 1); 
            length += (end - start + 1) * digit; 
            digit++;  
            start *= 10; 
        }

        System.out.println(length);
    }
}
