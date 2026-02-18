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
        } else if (command.getName().equals(BookingCommandExecutor.name)) {
            commandExecutor = new BookingCommandExecutor(bookingService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        } else if (command.getName().equals(AddMovieCommandExecutor.name)) {
            commandExecutor = new AddMovieCommandExecutor(movieService,screenService );
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals(AddScreenCommandExecutor.name)){
            commandExecutor = new AddScreenCommandExecutor(screenService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals(AddTheaterCommandExecutor.name)){
            commandExecutor = new AddTheaterCommandExecutor(theaterService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals(SetScreenForMovieCommandExecutor.name)){
            commandExecutor = new SetScreenForMovieCommandExecutor(screenService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        else if(command.getName().equals(DisplayAllScreenCommandExecutor.name)) {
            commandExecutor = new DisplayAllScreenCommandExecutor(screenService);
            commandExecutorHashMap.put(command.getName(), commandExecutor);
        }
        return commandExecutor;
    }
}
