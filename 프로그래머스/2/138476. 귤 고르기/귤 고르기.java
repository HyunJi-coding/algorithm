import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] count = new int[10000001];
        int maxSize = 0;
        
        for (int size : tangerine) {
            count[size]++;
            maxSize = Math.max(maxSize, size);
        }
        
        List<Integer> countList = new ArrayList<>();
        
        for (int i = 1; i <= maxSize; i++) {
            if (count[i] > 0) {
                countList.add(count[i]);
            }
        }
        
        countList.sort(Collections.reverseOrder());
        
        int sum = 0;
        for (int cnt : countList) {
            sum += cnt;
            answer++;
            if (sum >= k) {
                break;
            }
        }

        return answer;
    }
}
