package phone.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Casing extends Parts {

    protected String deviceName;
    protected List<Parts> partsList = new ArrayList<>();

    public Casing(String manufacturing, String country) {
        super(manufacturing, country);
    }

    public void add(Parts parts) {
        partsList.add(parts);
    }
    public abstract String turnOn();
}
