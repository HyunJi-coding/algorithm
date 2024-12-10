import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int rows = maps.length;
        int cols = maps[0].length();
        boolean[][] visited = new boolean[rows][cols];
        List<Integer> resources = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    resources.add(bfs(maps, visited, i, j));
                }
            }
        }

        if (resources.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(resources);
        return resources.stream().mapToInt(Integer::intValue).toArray();
    }

    private int bfs(String[] maps, boolean[][] visited, int startX, int startY) {
        int rows = maps.length;
        int cols = maps[0].length();
        int sum = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            sum += maps[x].charAt(y) - '0';

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols &&
                    !visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        return sum;
    }
}