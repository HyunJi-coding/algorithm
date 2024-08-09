import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            allNumbers.add(i);
        }
        
        for (int number : numbers) {
            allNumbers.remove(number);
        }
        
        int sum = 0;
        for (int missingNumber : allNumbers) {
            sum += missingNumber;
        }
        
        return sum;
    }
}