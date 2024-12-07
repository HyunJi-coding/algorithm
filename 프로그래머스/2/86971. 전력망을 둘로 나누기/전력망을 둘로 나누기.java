import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            List<List<Integer>> graph = buildGraph(n, wires, i);
            int count1 = bfs(1, graph, n);
            int count2 = n - count1;
            answer = Math.min(answer, Math.abs(count1 - count2));
        }

        return answer;
    }

    private List<List<Integer>> buildGraph(int n, int[][] wires, int skipIndex) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < wires.length; i++) {
            if (i == skipIndex) continue;
            graph.get(wires[i][0]).add(wires[i][1]);
            graph.get(wires[i][1]).add(wires[i][0]);
        }
        return graph;
    }

    private int bfs(int start, List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return count;
    }
}
