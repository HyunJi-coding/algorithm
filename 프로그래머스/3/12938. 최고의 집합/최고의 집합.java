import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        if (s < n) {
            return new int[] {-1};
        }

        int quotient = s / n;
        int remainder = s % n;

        int[] result = new int[n];
        Arrays.fill(result, quotient); 
        for (int i = 0; i < remainder; i++) {
            result[n - 1 - i]++;
        }

        return result;
    }
}