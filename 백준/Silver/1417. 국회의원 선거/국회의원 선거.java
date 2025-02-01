import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int dasom = Integer.parseInt(br.readLine()); 
        List<Integer> others = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            others.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (!others.isEmpty() && Collections.max(others) >= dasom) {
            int maxIndex = others.indexOf(Collections.max(others)); // 가장 표가 많은 후보 찾기
            others.set(maxIndex, others.get(maxIndex) - 1); 
            dasom++; 
            count++;
        }

        System.out.println(count);
    }
}
