import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력받을 문자열 배열 선언 (5줄 입력)
        String[] inputLines = new String[5];
        
        // 각 줄의 최대 길이 확인
        int maxLength = 0;
        
        // 5줄의 문자열을 입력받고 최대 길이 계산
        for (int i = 0; i < 5; i++) {
            inputLines[i] = scanner.nextLine();
            maxLength = Math.max(maxLength, inputLines[i].length());
        }
        
        // 세로로 읽기 결과를 담을 StringBuilder 선언
        StringBuilder result = new StringBuilder();
        
        // 세로로 읽기
        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                // 해당 줄의 현재 열에 문자가 있는 경우만 추가
                if (col < inputLines[row].length()) {
                    result.append(inputLines[row].charAt(col));
                }
            }
        }
        
        // 결과 출력
        System.out.println(result.toString());
        
        scanner.close();
    }
}