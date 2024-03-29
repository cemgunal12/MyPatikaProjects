package FilmProject;

public class ActionMovie extends Movie {
    private String actionType;

    public ActionMovie(String nameOfFilm, String director, int broadcastYear, double score, String actionType) {
        super(nameOfFilm, director, broadcastYear, score);
        this.actionType = actionType;
    }

    @Override
    public void ShowInformations() {
        super.ShowInformations();
        System.out.println("Action type is: " + actionType);
    }
}
