import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {

    public static void main(String[] args) {
        // Create a sample list of competitions
        List<List<String>> competitions = new ArrayList<>();
        competitions.add(List.of("TeamA", "TeamB"));
        competitions.add(List.of("TeamB", "TeamC"));
        competitions.add(List.of("TeamC", "TeamA"));

        // Create a sample list of results
        List<Integer> results = List.of(1, 0, 1);

        // Test the tournamentWinner method
        String winner = tournamentWinner(competitions, results);
        System.out.println("tournament winner is: " + winner);
    }

    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        String currentBestTeam = "";
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            List<String> competition = competitions.get(i);
            int result = results.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == 1) ? homeTeam : awayTeam; // result = 1 if home team won, 0 if away team won

            scores.put(winningTeam, scores.getOrDefault(winningTeam, 0) + 3);

            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }

        return currentBestTeam;
    }
}
