
import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int row = park.length;
        int col = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            if (size > row || size > col) {
                continue;
            }

            for (int r = 0; r <= row - size; r++) {
                for (int c = 0; c <= col - size; c++) {

                    boolean canPlace = true;

                    for (int y = r; y < r + size; y++) {
                        for (int x = c; x < c + size; x++) {
                            if (!park[y][x].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }

                        if (!canPlace) {
                            break;
                        }
                    }

                    if (canPlace) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }
}
