package Strategy;

import Model.Screen;
import Service.ScreenService;

public class SimpleStrategy implements IBookingStrategy {
    private ScreenService screenService;

    public SimpleStrategy(ScreenService screenService) {
        this.screenService = screenService;
    }
    @Override
    public Screen getScreen(String movieName) {
        Screen screen = screenService.getScreenForMovie(movieName);
        if(screen == null) {
            System.out.println("Screen not found, First allot screen to movie");
            return null;
        }
        return screen;
    }
}
