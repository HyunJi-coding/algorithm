import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String explosion = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        int explosionLength = explosion.length();

        for (char c : input.toCharArray()) {
            stack.push(c);

            // 폭발 문자열의 길이만큼 스택 확인
            if (stack.size() >= explosionLength) {
                boolean isExplosion = true;

                // 스택의 끝부분이 폭발 문자열과 일치하는지 확인
                for (int i = 0; i < explosionLength; i++) {
                    if (stack.get(stack.size() - explosionLength + i) != explosion.charAt(i)) {
                        isExplosion = false;
                        break;
                    }
                }

                // 폭발 문자열과 일치하면 해당 부분 제거
                if (isExplosion) {
                    for (int i = 0; i < explosionLength; i++) {
                        stack.pop();
                    }
                }
            }
        }

        // 스택에 남은 문자들을 문자열로 변환
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        // 결과 출력
        System.out.println(result.length() == 0 ? "FRULA" : result.toString());
    }
}
