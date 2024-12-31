import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long w = sc.nextLong(); 
        long s = sc.nextLong();

        long straight = (x + y) * w; 
        long diagonal = Math.min(x, y) * s + Math.abs(x - y) * w;
        long fullDiagonal = 0;

        if ((x + y) % 2 == 0) { 
            fullDiagonal = Math.max(x, y) * s;
        } else { 
            fullDiagonal = (Math.max(x, y) - 1) * s + w;
        }

        long result = Math.min(straight, Math.min(diagonal, fullDiagonal));
        System.out.println(result);
    }
}

