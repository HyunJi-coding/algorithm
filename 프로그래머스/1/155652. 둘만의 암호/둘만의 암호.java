class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        boolean[] skipCheck = new boolean[26];  

        for (char c : skip.toCharArray()) {
            skipCheck[c - 'a'] = true;
        }

        for (char c : s.toCharArray()) {
            int count = 0;
            char currentChar = c;

            while (count < index) {
                currentChar++;
                if (currentChar > 'z') {  
                    currentChar = 'a';
                }

                if (!skipCheck[currentChar - 'a']) {
                    count++;
                }
            }

            result.append(currentChar);
        }

        return result.toString();  
    }
}