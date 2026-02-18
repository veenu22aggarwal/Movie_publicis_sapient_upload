package Strategy;

import Model.Screen;

public interface IBookingStrategy {
    public Screen getScreen(String movieName);
}
