import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
       List<Integer> hallOfFame = new ArrayList<>();
        int[] result = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);

            Collections.sort(hallOfFame, Collections.reverseOrder());

            if (hallOfFame.size() > k) {
                hallOfFame.remove(hallOfFame.size() - 1);
            }

            result[i] = hallOfFame.get(hallOfFame.size() - 1);
        }

        return result;
    }
}