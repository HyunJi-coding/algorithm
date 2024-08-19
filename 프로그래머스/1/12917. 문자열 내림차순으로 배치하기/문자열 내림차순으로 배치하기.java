import java.util.*;
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        String sortedString = new StringBuilder(new String(chars)).reverse().toString();

        return sortedString;
    }
}