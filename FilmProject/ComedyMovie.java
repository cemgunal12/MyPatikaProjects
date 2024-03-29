package FilmProject;

public class ComedyMovie extends Movie {
    private int numberOfJokes;

    public ComedyMovie(String nameOfFilm, String director, int broadcastYear, double score, int numberOfJokes) {
        super(nameOfFilm, director, broadcastYear, score);
        this.numberOfJokes = numberOfJokes;
    }

    @Override
    public void ShowInformations() {
        super.ShowInformations();
        System.out.println("Number Of Jokes: " + numberOfJokes);
    }
}
