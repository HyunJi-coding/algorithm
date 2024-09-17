import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int totalProfit = 0;
        
        for (int i = score.length - m; i >= 0; i -= m) {
            totalProfit += score[i] * m;  
        }
        
        return totalProfit;
    }
}