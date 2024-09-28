import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
         int[] result = new int[targets.length];
        
        Map<Character, Integer> keyStrokeMap = new HashMap<>();
        
        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char ch = keys.charAt(i);
                if (!keyStrokeMap.containsKey(ch) || keyStrokeMap.get(ch) > i + 1) {
                    keyStrokeMap.put(ch, i + 1); 
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int keystrokes = 0;
            boolean possible = true;
            
            for (char ch : target.toCharArray()) {
                if (keyStrokeMap.containsKey(ch)) {
                    keystrokes += keyStrokeMap.get(ch);
                } else {
                    possible = false;
                    break;  
                }
            }
            
            result[i] = possible ? keystrokes : -1;
        }
        
        return result;
    }
}