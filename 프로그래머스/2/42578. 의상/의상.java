import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
         HashMap<String, Integer> categoryCount = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String category = cloth[1];
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }
        
        int answer = 1;
        
        for (int count : categoryCount.values()) {
            answer *= (count + 1);  
        }
        
        return answer - 1;
    }
}