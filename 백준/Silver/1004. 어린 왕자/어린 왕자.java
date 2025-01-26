import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int n = sc.nextInt(); // 
            int count = 0; 

            for (int i = 0; i < n; i++) {
                int cx = sc.nextInt(); 
                int cy = sc.nextInt(); 
                int r = sc.nextInt();  

                boolean startInside = isInside(x1, y1, cx, cy, r);
                boolean endInside = isInside(x2, y2, cx, cy, r);

                if (startInside != endInside) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    public static boolean isInside(int x, int y, int cx, int cy, int r) {
        return Math.pow(x - cx, 2) + Math.pow(y - cy, 2) < Math.pow(r, 2);
    }
}
