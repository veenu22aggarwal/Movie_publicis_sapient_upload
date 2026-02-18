package Service;

import Model.Movie;

import java.util.HashMap;

public class MovieService {
    private final HashMap<String, Movie> movies;
    public MovieService() {
        movies = new HashMap<String, Movie>();
    }

    public void addMovie(String name, int id) {
        Movie movie = new Movie(name,id);
        movies.put(name, movie);
        System.out.println("Added movie " + name + " " + id);
    }

    public Movie getMovie(String name) {
        return movies.get(name);
    }
}
