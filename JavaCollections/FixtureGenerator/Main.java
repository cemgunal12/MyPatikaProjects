package JavaCollections.FixtureGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teamsEven = new ArrayList<>();
        teamsEven.add("Galatasaray");
        teamsEven.add("Bursaspor");
        teamsEven.add("Fenerbahçe");
        teamsEven.add("Beşiktaş");
        teamsEven.add("Başakşehir");
        teamsEven.add("Trabzonspor");

        FixtureGenerator generatorEven = new FixtureGenerator(teamsEven);
        List<String> fixturesEven = generatorEven.generateFixtures();

        System.out.println("Takım sayısı çift senaryosu\n");
        for (String fixture : fixturesEven) {
            System.out.println(fixture);
        }

        List<String> teamsOdd = new ArrayList<>();
        teamsOdd.add("Galatasaray");
        teamsOdd.add("Bursaspor");
        teamsOdd.add("Fenerbahçe");
        teamsOdd.add("Beşiktaş");
        teamsOdd.add("Başakşehir");
        teamsOdd.add("Boluspor");

        FixtureGenerator generatorOdd = new FixtureGenerator(teamsOdd);
        List<String> fixturesOdd = generatorOdd.generateFixtures();

        System.out.println("\nTakım sayısı tek senaryosu\n");
        for (String fixture : fixturesOdd) {
            System.out.println(fixture);
        }
    }
}
