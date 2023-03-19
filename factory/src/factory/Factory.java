package factory;

import java.util.List;

public abstract class Factory {
    public final Product create(String name, String model) throws Exception {
        Product p = createTelevision(name, model);
        registerTelevision(p);
        return p;
    }
    protected abstract Product createTelevision(String name, String model) throws Exception;
    protected abstract void registerTelevision(Product television);
}
