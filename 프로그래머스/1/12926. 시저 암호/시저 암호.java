class Solution {
    public String solution(String s, int n) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char)((ch - 'A' + n) % 26 + 'A');
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)((ch - 'a' + n) % 26 + 'a');
            }
            else {
                result += ch;
            }
        }

        return result;
    }
}