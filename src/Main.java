import Command.CommandExecutor;
import Command.CommandExecutorFactory;
import Model.Command;
import Service.BookingService;
import Service.MovieService;
import Service.ScreenService;
import Service.TheaterService;
import Strategy.IBookingStrategy;
import Strategy.SimpleStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is Movie Service");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MovieService movieService = new MovieService();
        TheaterService theaterService = new TheaterService();
        ScreenService screenService = new ScreenService(theaterService, movieService);
        IBookingStrategy bookingStrategy = new SimpleStrategy(screenService);
        BookingService bookingService = new BookingService(bookingStrategy);
        CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory();

        while (true) {
            try {
                String input = br.readLine();
                if (input.equals("exit")) {
                    break;
                }
                Command command = new Command(input);
                CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command,movieService,bookingService,screenService,theaterService);
                if(commandExecutor == null){
                    System.out.println("Command not found");
                }
                else {
                   commandExecutor.execute(command.getParams());
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}