import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1);
        distances[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.get(current)) {
                if (distances[neighbor] == -1) {
                    distances[neighbor] = distances[current] + 1;
                    queue.add(neighbor);
                }
            }
        }

        int maxDistance = Arrays.stream(distances).max().orElse(0);
        int count = (int) Arrays.stream(distances).filter(d -> d == maxDistance).count();

        return count;
    }
}





