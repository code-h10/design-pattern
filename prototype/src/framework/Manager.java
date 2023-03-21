package framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Shape> showCase = new HashMap<>();

    public void register(String name, Shape proto) {
        showCase.put(name, proto);
    }

    public Shape create(String name) {
        Shape p = showCase.get(name);
        return p.createClone();
    }
}