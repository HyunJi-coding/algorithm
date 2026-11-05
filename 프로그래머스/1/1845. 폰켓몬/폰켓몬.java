import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int selectCount = nums.length / 2;
        int typeCount = set.size();

        return Math.min(selectCount, typeCount);
    }
}