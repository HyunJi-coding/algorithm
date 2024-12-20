import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 배열의 크기 입력 받기
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        
        int[] A = new int[n];
        int[] B = new int[n];
        
        // 배열 A 입력 받기
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        // 배열 B 입력 받기
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        
        // 배열 A는 오름차순, 배열 B는 내림차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        
        // 배열 A와 B의 각 요소를 곱하여 합산
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i];
        }
        
        // 결과 출력
        System.out.println(sum);
        
        sc.close();
    }
}
