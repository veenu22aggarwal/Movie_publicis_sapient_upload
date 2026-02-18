package Model;

public class Screen {
    private final int id;
    private final String name;
    private String  movieName;
    private final int theaterId;

    public Screen(int id ,String name, int theaterId) {
        this.id = id;
        this.name = name;
        this.theaterId = theaterId;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getTheaterId() {
        return theaterId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieForScreen(String movieName) {
        this.movieName = movieName;
    }
}
