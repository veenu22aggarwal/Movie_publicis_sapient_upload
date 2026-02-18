package Command;

import Service.ScreenService;

import java.util.List;

public class AddScreenCommandExecutor extends  CommandExecutor {
    public static final String name = "AddScreen";
    protected ScreenService screenService;

    public AddScreenCommandExecutor(ScreenService screenService) {
        this.screenService = screenService;
    }
    @Override
    public void execute(List<String> params) {
        screenService.addScreen(Integer.parseInt(params.getFirst()), params.get(1), Integer.parseInt(params.get(2)));
    }
}
