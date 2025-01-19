import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String document = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int index = 0;

        while (index <= document.length() - word.length()) {
            if (document.substring(index, index + word.length()).equals(word)) {
                count++;
                index += word.length(); 
            } else {
                index++;
            }
        }

        System.out.println(count);
    }
}
