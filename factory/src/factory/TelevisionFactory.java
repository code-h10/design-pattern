package factory;

import java.util.ArrayList;
import java.util.List;

public class TelevisionFactory extends Factory{
    private List<Product> store = new ArrayList<>();

    @Override
    protected Product createTelevision(String name, String model) throws Exception {
        if (name.equals("samsung")) {
            return new Samsung(name, model);
        } else if (name.equals("sony")) {
            return new Sony(name, model);
        } else if (name.equals("lg")) {
            return new Lg(name, model);
        } else {
            throw new ClassNotFoundException();
        }
    }

    @Override
    protected void registerTelevision(Product television) {
        store.add(television);
    }
}
