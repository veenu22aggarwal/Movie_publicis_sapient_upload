package Command;

import Service.MovieService;
import Service.ScreenService;

import java.util.List;

public class SetScreenForMovieCommandExecutor extends CommandExecutor {
    public static final String name = "SetScreenForMovie";
    protected ScreenService screenService;

    public SetScreenForMovieCommandExecutor(ScreenService screenService) {
        this.screenService = screenService;
    }

    @Override
    public void execute(List<String> params) {
        screenService.setMovie(params.getFirst());
    }
}
