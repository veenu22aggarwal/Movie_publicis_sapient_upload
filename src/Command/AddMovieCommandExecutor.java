package Command;

import Model.Movie;
import Service.MovieService;
import Service.ScreenService;

import java.util.List;

public class AddMovieCommandExecutor extends CommandExecutor {
    public static final String name = "AddMovie";
    protected MovieService movieService;
    protected ScreenService screenService;

    public AddMovieCommandExecutor(MovieService movieService, ScreenService screenService) {
        this.movieService = movieService;
        this.screenService = screenService;
    }

    @Override
    public void execute(List<String> params) {
        movieService.addMovie(params.getFirst(), Integer.parseInt(params.get(1)));
        //screenService.setMovie(Integer.parseInt(params.getLast()),params.getFirst());
    }
}
