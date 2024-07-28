import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            priorityQueue.offer(priority);
        }

        int answer = 0;
        while (true) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priorityQueue.peek()) {
                    answer++;
                    priorityQueue.poll(); 
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
    }
}