class Solution {
    public int solution(String s) {
        int count = 0;  
        int sameCount = 0;  
        int diffCount = 0;  
        char firstChar = s.charAt(0); 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                sameCount++;
            } else {
                diffCount++;
            }

            if (sameCount == diffCount) {
                count++;
                if (i + 1 < s.length()) {
                    firstChar = s.charAt(i + 1);  
                }
                sameCount = 0;
                diffCount = 0;
            }
        }

        if (sameCount != 0 || diffCount != 0) {
            count++;
        }

        return count;
    }
    
}