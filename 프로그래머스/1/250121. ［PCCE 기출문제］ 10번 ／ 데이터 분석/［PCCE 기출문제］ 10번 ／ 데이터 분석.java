
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] columns = {"code", "date", "maximum", "remain"};

        int extIdx = 0;
        int sortIdx = 0;

        for (int i = 0; i < columns.length; i++) {
            if (columns[i].equals(ext)) {
                extIdx = i;
            }
            if (columns[i].equals(sort_by)) {
                sortIdx = i;
            }
        }

        List<int[]> list = new ArrayList<>();

        for (int[] row : data) {
            if (row[extIdx] < val_ext) {
                list.add(row);
            }
        }

        final int idx = sortIdx;
        list.sort((a, b) -> Integer.compare(a[idx], b[idx]));

        return list.toArray(new int[0][]);
    }
}
