package phone.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class MainBoard extends Parts {
    protected List<Parts> partsList = new ArrayList<>();

    public MainBoard(String manufacturing, String country) {
        super(manufacturing, country);
    }

    public void add(Parts parts) {
        partsList.add(parts);
    }
}
