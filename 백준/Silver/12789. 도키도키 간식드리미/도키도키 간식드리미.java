import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 간식의 개수
        int[] snacks = new int[n];
        
        for (int i = 0; i < n; i++) {
            snacks[i] = scanner.nextInt(); // 간식 번호 입력
        }

        Stack<Integer> stack = new Stack<>(); // 보조 스택
        int current = 1; // 현재 배달해야 하는 간식 번호

        for (int snack : snacks) {
            // 간식을 순서대로 스택에 넣음
            stack.push(snack);

            // 스택의 top이 현재 배달 순서에 맞으면 계속 pop
            while (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++;
            }
        }

        // 스택이 비어 있으면 성공, 아니면 실패
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}