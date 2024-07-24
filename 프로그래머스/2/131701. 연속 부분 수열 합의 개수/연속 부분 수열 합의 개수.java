import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] elements) {
         Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n];
                }
                sumSet.add(sum);
            }
        }

        return sumSet.size();
    
    }
}