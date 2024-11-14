class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weights = {781, 156, 31, 6, 1};
        String vowels = "AEIOU";

        for (int i = 0; i < word.length(); i++) {
            int position = vowels.indexOf(word.charAt(i));
            answer += position * weights[i] + 1;
        }
        
        return answer;
    }
}