package FilmProject;

public class FilmTest {
    public static void main(String[] args) {
    	ActionMovie actionMovie = new ActionMovie("Matrix", "Lana Wachowski", 1999, 8.7, "Science fiction");
        
    	ComedyMovie comedyMovie = new ComedyMovie("The Hangover", "Todd Phillips", 2009, 7.7, 100);

        System.out.println("Action Movie Information:");
        actionMovie.ShowInformations();

        System.out.println("\nComedy Movie Information:");
        comedyMovie.ShowInformations();
                
    }
}
