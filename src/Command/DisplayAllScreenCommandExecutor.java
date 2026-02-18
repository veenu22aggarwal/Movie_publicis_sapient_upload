package Command;

import Service.ScreenService;

import java.util.List;

public class DisplayAllScreenCommandExecutor extends CommandExecutor {
    public static final String name = "DisplayAllScreen";
    protected ScreenService screenService;

    public DisplayAllScreenCommandExecutor(ScreenService screenService) {
        this.screenService = screenService;
    }

    @Override
    public void execute(List<String> params) {
        screenService.DisplayAllShows();
    }
}
