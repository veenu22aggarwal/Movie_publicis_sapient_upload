package Command;

import Model.Theater;
import Service.TheaterService;

import java.util.List;

public class AddTheaterCommandExecutor extends CommandExecutor {
    public static final String name = "AddTheater";
    protected TheaterService theaterService;

    public AddTheaterCommandExecutor(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @Override
    public void execute(List<String> params) {
        this.theaterService.addTheater(Integer.parseInt(params.getFirst()), params.getLast());
    }
}
