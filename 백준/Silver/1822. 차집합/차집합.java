import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeB; i++) {
            setA.remove(Integer.parseInt(st.nextToken()));
        }

        if (setA.isEmpty()) {
            System.out.println(0);
        } else {
            sb.append(setA.size()).append("\n");
            for (int num : setA) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
        }
    }
}
