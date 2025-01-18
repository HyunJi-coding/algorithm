import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int difference = 0;

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    difference++;
                }
            }
            minDifference = Math.min(minDifference, difference);
        }

        System.out.println(minDifference);
    }
}
