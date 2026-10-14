import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<long[]> points = new ArrayList<>();

        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;

        // 1. 모든 직선의 교점 구하기
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];

                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long det = a * d - b * c;

                // 평행한 직선은 교점이 없음
                if (det == 0) continue;

                long x = b * f - e * d;
                long y = e * c - a * f;

                // 정수 좌표인 교점만 저장
                if (x % det != 0 || y % det != 0) {
                    continue;
                }

                x /= det;
                y /= det;

                points.add(new long[]{x, y});

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }
        }

        // 2. 최소 크기의 격자 만들기
        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);

        char[][] board = new char[height][width];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        // 3. 교점 위치에 별 표시
        for (long[] point : points) {
            int x = (int) (point[0] - minX);
            int y = (int) (maxY - point[1]);

            board[y][x] = '*';
        }

        String[] answer = new String[height];

        for (int i = 0; i < height; i++) {
            answer[i] = new String(board[i]);
        }

        return answer;
    }
}