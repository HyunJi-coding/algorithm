import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genreTotalPlays.put(genres[i], genreTotalPlays.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        sortedGenres.sort((g1, g2) -> genreTotalPlays.get(g2) - genreTotalPlays.get(g1));

        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    songs.add(new int[]{i, plays[i]});
                }
            }

            songs.sort((s1, s2) -> s2[1] != s1[1] ? s2[1] - s1[1] : s1[0] - s2[0]);

            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[0]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}