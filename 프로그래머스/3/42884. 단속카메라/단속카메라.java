import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));
        int cameras = 0;
        int lastCamera = Integer.MIN_VALUE;

        for (int[] route : routes) {
            if (route[0] > lastCamera) {
                cameras++;
                lastCamera = route[1];
            }
        }

        return cameras;
    }
}