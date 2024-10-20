class Solution {
    public int solution(int hp) {
        int[] ants = {5, 3, 1}; 
        int count = 0;

        for (int ant : ants) {
            count += hp / ant; 
            hp %= ant; 
        }

        return count; 
    }
}