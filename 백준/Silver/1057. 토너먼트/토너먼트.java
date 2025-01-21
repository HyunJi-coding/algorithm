import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int kim = sc.nextInt(); 
        int lim = sc.nextInt(); 

        int round = 0;

        while (kim != lim) {
            kim = (kim + 1) / 2; 
            lim = (lim + 1) / 2; 
            round++;
        }

        System.out.println(round);
    }
}
