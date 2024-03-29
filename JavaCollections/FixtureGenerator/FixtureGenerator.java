package JavaCollections.FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        if (teams.size() % 2 != 0) {
            // Eğer takım sayısı tekse, "Bay" takımını ekleyin
            teams.add("Bay");
        }
        this.teams = teams;
    }

    public List<String> generateFixtures() {
        List<String> fixtures = new ArrayList<>();
        int totalRounds = teams.size() - 1; // Toplam tur sayısı

        for (int round = 1; round <= totalRounds; round++) {
            fixtures.add("Round " + round);
            for (int i = 0; i < teams.size() / 2; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);

                if (!homeTeam.equals("Bay") && !awayTeam.equals("Bay")) {
                    fixtures.add(homeTeam + " vs " + awayTeam);
                }
            }
            // Takımları döndürme
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }

        return fixtures;
    }
}
