package FilmProject;

public class Movie {
    private String nameOfFilm;
    private String director;
    private int broadcastYear;
    private double score;

    public Movie(String nameOfFilm, String director, int broadcastYear, double score) {
        this.nameOfFilm = nameOfFilm;
        this.director = director;
        this.broadcastYear = broadcastYear;
        this.score = score;
    }

    public void ShowInformations() {
        System.out.println("Name of Movie: " + nameOfFilm);
        System.out.println("Director: " + director);
        System.out.println("Broadcast year: " + broadcastYear);
        System.out.println("Score: " + score);
    }
}