import java.util.*;

class Solution {
    List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        return moves.toArray(new int[moves.size()][]);
    }

    private void hanoi(int n, int start, int end, int temp) {
        if (n == 1) {
            moves.add(new int[]{start, end});
            return;
        }
        hanoi(n - 1, start, temp, end);
        moves.add(new int[]{start, end});
        hanoi(n - 1, temp, end, start);
    }
}
