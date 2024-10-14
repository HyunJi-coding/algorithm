import java.util.Stack;
class Solution {
    public int solution(String s) {
         int count = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char open = stack.pop();
                    if ((ch == ')' && open != '(') || 
                        (ch == '}' && open != '{') || 
                        (ch == ']' && open != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                count++;
            }
            s = s.substring(1) + s.charAt(0);
        }
        
        return count;
    }
}