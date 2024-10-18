class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[8]; 
        String types = "RTCFJMAN"; 

        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) { 
                scores[types.indexOf(type1)] += (4 - choice);
            } else if (choice > 4) { 
                scores[types.indexOf(type2)] += (choice - 4);
            }
        }

        StringBuilder result = new StringBuilder();

        result.append(scores[0] >= scores[1] ? 'R' : 'T');
        result.append(scores[2] >= scores[3] ? 'C' : 'F');
        result.append(scores[4] >= scores[5] ? 'J' : 'M');
        result.append(scores[6] >= scores[7] ? 'A' : 'N');

        return result.toString();
    }
}