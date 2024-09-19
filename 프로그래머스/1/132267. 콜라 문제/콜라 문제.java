class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
        
        while (n >= a) {
            int newcola = (n / a) * b; 
            answer += newcola; 
            n = (n % a) + newcola; 
        }
        
        return answer;
    }
}