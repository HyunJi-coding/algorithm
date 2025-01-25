import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] heights = new int[n]; 
        int[] result = new int[n]; 

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = heights[i]; 
            for (int j = 0; j < n; j++) {
                if (count == 0 && result[j] == 0) {
                    result[j] = i + 1; 
                    break;
                } else if (result[j] == 0) {
                    count--; 
                }
            }
        }


        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
