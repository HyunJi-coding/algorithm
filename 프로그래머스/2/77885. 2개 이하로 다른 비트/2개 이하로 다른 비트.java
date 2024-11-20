class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];
            if (x % 2 == 0) {
                answer[i] = x + 1;
            } else {
                long lowestZero = (~x) & (x + 1);
                answer[i] = x + lowestZero - (lowestZero >> 1);
            }
        }
        return answer;
    }
}