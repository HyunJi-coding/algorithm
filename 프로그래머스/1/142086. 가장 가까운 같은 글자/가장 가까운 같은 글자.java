class Solution {
    public int[] solution(String s) {
         int[] answer = new int[s.length()];
        int[] lastIndexArray = new int[128];  
        
        for (int i = 0; i < 128; i++) {
            lastIndexArray[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (lastIndexArray[ch] != -1) {
                answer[i] = i - lastIndexArray[ch];
            } else {
                answer[i] = -1;  
            }

            lastIndexArray[ch] = i;
        }

        return answer;
    }
}