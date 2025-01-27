import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int low = 0; 
        int high = 1001;

        for (int i = 0; i < L; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < n) low = Math.max(low, num);
            if (num > n) high = Math.min(high, num);
            if (num == n) { 
                System.out.println(0);
                return;
            }
        }

       
        int result = (n - low) * (high - n) - 1;
        System.out.println(result);
    }
}