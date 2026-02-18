package Model;

import Service.ScreenService;

public class Booking {
    private int bookingId;
    private Screen screen;

    public Booking(int bookingId, Screen screen) {
        this.bookingId = bookingId;
        this.screen = screen;
    }

    public int getBookingId() {
        return bookingId;
    }
    public Screen getScreen() {
        return screen;
    }

}
