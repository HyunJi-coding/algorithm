class Solution {
    public int[] solution(int[] arr) {
         if (arr.length == 1) {
            return new int[] {-1};
        }

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}