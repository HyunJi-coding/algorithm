class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int w = 3; w <= total / 3; w++) {
            if (total % w == 0) {
                int h = total / w;

                if (2 * w + 2 * h - 4 == brown) {
                    if (w >= h) {
                        return new int[] {w, h};
                    } else {
                        return new int[] {h, w};
                    }
                }
            }
        }

        return new int[] {};
    
    }
}