package Model;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final int id;
    private final String name;
    //private final List<Screen> screens;

    public Theater(int id, String name) {
        this.id = id;
        this.name = name;
        //this.screens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
