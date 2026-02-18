package Service;

import Model.Booking;
import Model.Screen;
import Strategy.IBookingStrategy;

import java.util.HashMap;
import java.util.Random;

public class BookingService {
    private final HashMap<Integer, Booking> bookings;
    private final IBookingStrategy bookingStrategy;
    public BookingService(IBookingStrategy bookingStrategy) {
        bookings = new HashMap<>();
        this.bookingStrategy = bookingStrategy;
    }

    public void bookMovie(String movieName) {
        Screen screen = bookingStrategy.getScreen(movieName);
        if(screen == null)
            return;

        Random random = new Random();
        Booking booking = new Booking(random.nextInt(0,Integer.MAX_VALUE), screen);
        System.out.println("Booking Confirmed !");
        System.out.println("Your BookingId is "+ booking.getBookingId()+" On screen "+ screen.getName()+" in Theater "+screen.getTheaterId());
        bookings.put(booking.getBookingId(), booking);
    }
}
