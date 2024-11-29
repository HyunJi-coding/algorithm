import java.util.*;

class Solution {
    private List<String> result = new ArrayList<>();
    private boolean[] visited;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, Comparator.comparing(o -> o[1]));
        dfs("ICN", "ICN", tickets, 0);
        return result.get(0).split(" ");
    }

    private void dfs(String current, String path, String[][] tickets, int count) {
        if (count == tickets.length) {
            result.add(path);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}

