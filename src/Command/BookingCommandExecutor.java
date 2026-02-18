package Command;

import Service.BookingService;

import java.util.List;

public class BookingCommandExecutor extends CommandExecutor {
    public static final String name = "Booking";
    private final BookingService bookingService;

    public BookingCommandExecutor(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public void execute(List<String> params) {
        bookingService.bookMovie(params.get(0));
    }
}
