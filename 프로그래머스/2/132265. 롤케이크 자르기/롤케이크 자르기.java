import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> toppingCount = new HashMap<>();
        HashSet<Integer> rightSet = new HashSet<>();
        int count = 0;

        for (int t : topping) {
            toppingCount.put(t, toppingCount.getOrDefault(t, 0) + 1);
        }

        HashSet<Integer> leftSet = new HashSet<>();

        for (int i = 0; i < topping.length; i++) {
            leftSet.add(topping[i]);

            toppingCount.put(topping[i], toppingCount.get(topping[i]) - 1);

            if (toppingCount.get(topping[i]) == 0) {
                toppingCount.remove(topping[i]);
            }

            if (leftSet.size() == toppingCount.size()) {
                count++;
            }
        }

        return count;
    }
}