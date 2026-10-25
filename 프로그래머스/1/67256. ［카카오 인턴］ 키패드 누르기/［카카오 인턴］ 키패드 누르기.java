
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;  
        int right = 12;  
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = num;
            } else {
                int target = (num == 0) ? 11 : num;

                int leftDist = getDistance(left, target);
                int rightDist = getDistance(right, target);

                if (leftDist < rightDist) {
                    answer.append("L");
                    left = target;
                } else if (leftDist > rightDist) {
                    answer.append("R");
                    right = target;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = target;
                    } else {
                        answer.append("R");
                        right = target;
                    }
                }
            }
        }

        return answer.toString();
    }

    private int getDistance(int from, int to) {
        int fromRow = (from - 1) / 3;
        int fromCol = (from - 1) % 3;

        int toRow = (to - 1) / 3;
        int toCol = (to - 1) % 3;

        return Math.abs(fromRow - toRow)
             + Math.abs(fromCol - toCol);
    }
}
