import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        while (M-- > 0) {
            int target = Integer.parseInt(st.nextToken());
            int idx = deque.indexOf(target);
            int half = deque.size() / 2;

            if (idx <= half) {
                while (deque.peekFirst() != target) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                while (deque.peekFirst() != target) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);
    }
}
