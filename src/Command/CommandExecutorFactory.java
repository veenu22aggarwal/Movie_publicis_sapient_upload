package Command;

import Model.Command;
import Service.BookingService;
import Service.MovieService;
import Service.ScreenService;
import Service.TheaterService;

import java.util.HashMap;
import java.util.Scanner;

public class CommandExecutorFactory {
    private final HashMap<String, CommandExecutor> commandExecutorHashMap;
    public CommandExecutorFactory() {
        commandExecutorHashMap = new HashMap<>();
    }
    public CommandExecutor getCommandExecutor(Command command, MovieService movieService, BookingService bookingService, ScreenService screenService, TheaterService theaterService) {
        CommandExecutor commandExecutor = null;
        if (commandExecutorHashMap.containsKey(command.getName())) {
            commandExecutor = commandExecutorHashMap.get(command.getName());
        } else if (command.getName().equals("Booking")) {
            commandExecutor = new BookingCommandExecutor(bookingService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        } else if (command.getName().equals("AddMovie")) {
            commandExecutor = new AddMovieCommandExecutor(movieService,screenService );
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals("AddScreen")){
            commandExecutor = new AddScreenCommandExecutor(screenService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals("AddTheater")){
            commandExecutor = new AddTheaterCommandExecutor(theaterService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals("SetScreenForMovie")){
            commandExecutor = new SetScreenForMovieCommandExecutor(screenService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        return commandExecutor;
    }
}
