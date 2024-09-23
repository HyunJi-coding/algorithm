class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 발음 가능한 단어들
        String[] validWords = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String prevWord = ""; 
            boolean isValid = true;
            
            while (!word.isEmpty()) {
                boolean found = false; 
                
                for (String validWord : validWords) {
                    if (word.startsWith(validWord)) {
                        if (prevWord.equals(validWord)) {
                            isValid = false;
                            break;
                        }
                        
                        word = word.substring(validWord.length());
                        prevWord = validWord;
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                answer++;
            }
        }
        
        return answer;
    }
}