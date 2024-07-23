
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> required = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            required.put(want[i], number[i]);
        }

        int totalDays = discount.length;
        int periodLength = 10; 
        int count = 0;

      
        for (int i = 0; i <= totalDays - periodLength; i++) {
            Map<String, Integer> current = new HashMap<>();

            for (int j = i; j < i + periodLength; j++) {
                current.put(discount[j], current.getOrDefault(discount[j], 0) + 1);
            }

            boolean isValid = true;
            for (String key : required.keySet()) {
                if (!current.containsKey(key) || current.get(key) < required.get(key)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}