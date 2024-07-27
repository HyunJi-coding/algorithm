import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> releaseDays = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int daysToComplete = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            releaseDays.add(daysToComplete);
        }
        
        List<Integer> result = new ArrayList<>();
        
        int currentReleaseDay = releaseDays.get(0);
        int count = 1;
        
        for (int i = 1; i < releaseDays.size(); i++) {
            if (releaseDays.get(i) <= currentReleaseDay) {
                count++;
            } else {
                result.add(count);
                count = 1;
                currentReleaseDay = releaseDays.get(i);
            }
        }
        
        result.add(count);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}