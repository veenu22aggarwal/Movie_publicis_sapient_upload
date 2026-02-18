package Model;

import Service.BookingService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
    private String name;
    private List<String> params;

    public Command(String input) {
        String[] arr = input.split(" ");
        this.name = arr[0];
        List<String> paramsList = Arrays.asList(arr);
        ArrayList tempList = new ArrayList();
        tempList.addAll(paramsList);
        tempList.remove(0);
        this.params = tempList;
    }

    public String getName() {
        return name;
    }

    public List<String> getParams() {
        return params;
    }
}
