import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int aCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') aCount++;
        }
        int minBCount = Integer.MAX_VALUE;
        for (int start = 0; start < n; start++) {
            int bCount = 0;
            for (int i = 0; i < aCount; i++) {
                int index = (start + i) % n;
                if (s.charAt(index) == 'b') bCount++;
            }
            if (bCount < minBCount) minBCount = bCount;
        }
        System.out.println(minBCount);
    }
}
