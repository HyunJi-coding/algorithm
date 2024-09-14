class Solution {
    public String solution(int[] food) {
        String leftSide = "";

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;  
            for (int j = 0; j < count; j++) {
                leftSide += i;  
            }
        }
        
        String rightSide = new StringBuilder(leftSide).reverse().toString();
        return leftSide + "0" + rightSide;
    }
}