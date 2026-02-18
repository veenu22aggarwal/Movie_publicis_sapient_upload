package Service;

import Model.Theater;

import java.util.HashMap;

public class TheaterService {
    private final HashMap<Integer, Theater> theaterHashMap;

    public TheaterService() {
        theaterHashMap = new HashMap<>();
    }

    public void addTheater(int id, String name) {
        Theater theater = new Theater(id,name);
        theaterHashMap.put(id,theater);
        System.out.println("Added Theater " + id + " " + name);
    }

    public Theater getTheater(int id) {
        return theaterHashMap.get(id);
    }

}
