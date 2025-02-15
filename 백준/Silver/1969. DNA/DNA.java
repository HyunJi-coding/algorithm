import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        sc.nextLine(); 
        String[] dnaList = new String[N];
        for (int i = 0; i < N; i++) {
            dnaList[i] = sc.nextLine();
        }

        StringBuilder resultDNA = new StringBuilder();
        int totalHammingDistance = 0;

        for (int i = 0; i < M; i++) {
            int[] count = new int[4];
            for (int j = 0; j < N; j++) {
                char c = dnaList[j].charAt(i);
                if (c == 'A') count[0]++;
                else if (c == 'C') count[1]++;
                else if (c == 'G') count[2]++;
                else if (c == 'T') count[3]++;
            }

            int maxIdx = 0;
            for (int k = 1; k < 4; k++) {
                if (count[k] > count[maxIdx]) {
                    maxIdx = k;
                }
            }

            char selectedChar = "ACGT".charAt(maxIdx);
            resultDNA.append(selectedChar);

            for (int j = 0; j < N; j++) {
                if (dnaList[j].charAt(i) != selectedChar) {
                    totalHammingDistance++;
                }
            }
        }

        System.out.println(resultDNA.toString());
        System.out.println(totalHammingDistance);

        sc.close();
    }
}
