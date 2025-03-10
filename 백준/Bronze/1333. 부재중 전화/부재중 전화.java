import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), L = sc.nextInt(), D = sc.nextInt();
        
        int time = 0;
        List<Boolean> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) list.add(true);
            if (i != N - 1) for (int j = 0; j < 5; j++) list.add(false);
        }
        
        while (time < list.size()) {
            if (!list.get(time)) {
                System.out.println(time);
                return;
            }
            time += D;
        }
        
        System.out.println(time);
    }
}
