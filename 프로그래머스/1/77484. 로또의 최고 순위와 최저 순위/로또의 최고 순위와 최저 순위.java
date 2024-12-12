import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            } else if (Arrays.stream(win_nums).anyMatch(num -> num == lotto)) {
                matchCount++;
            }
        }

        int maxRank = Math.min(7 - (matchCount + zeroCount), 6);
        int minRank = Math.min(7 - matchCount, 6);

        return new int[]{maxRank, minRank};
    }
}