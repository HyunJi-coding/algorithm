import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int work : works) {
            pq.add(work);
        }
        
        while (n > 0 && !pq.isEmpty()) {
            int maxWork = pq.poll(); 
            if (maxWork > 0) {
                pq.add(maxWork - 1); 
                n--;
            }
        }
        
        long answer = 0;
        while (!pq.isEmpty()) {
            int work = pq.poll();
            answer += (long) work * work; 
        }
        
        return answer;
    }
}