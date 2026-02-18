package Service;

import Model.Movie;
import Model.Screen;
import Model.Theater;

import java.util.HashMap;
import java.util.Map;

public class ScreenService {
    private final HashMap<Integer, Screen> screens;
    private final TheaterService theater;
    private Movie movie;

    public ScreenService(TheaterService theater, MovieService movie) {
        screens = new HashMap<>();
        this.theater = theater;
        movie = null;
    }

    public void addScreen(int id, String name, int theaterId) {
        Screen screen = new Screen(id,name,theaterId);
        screens.put(id, screen);
        System.out.println("Added Screen " + id + " " + name);
    }

    public void setMovie(String movieName) {
        for(Map.Entry<Integer,Screen> mp : screens.entrySet()) {
            if(mp.getValue().getMovieName() == null) {
                Screen screen = mp.getValue();
                screen.setMovieForScreen(movieName);
                return;
            }
        }
        System.out.println("No Screen Available for " + movieName);
        /*if(!screens.containsKey(id))
            System.out.println(" Screen Not Found");
        Screen screen = screens.get(id);
        screen.setMovieForScreen(movieName);*/
    }

    public Screen getScreenForMovie(String movieName)
    {
        for(Map.Entry<Integer,Screen> mp : screens.entrySet()) {
            if(mp.getValue().getMovieName().equals(movieName))
                return mp.getValue();
        }
        return null;
    }

    public void DisplayAllShows(){
        for(Map.Entry<Integer,Screen> mp : screens.entrySet())
        {
            Screen screen = mp.getValue();
            if( screen.getMovieName() != null) {
                String theaterName = theater.getTheater(screen.getTheaterId()).getName();
                System.out.println(" On Screen " + screen.getName() + " movie is getting played "+ screen.getMovieName()+" in theater "+ theaterName);
            }
        }
    }
}
