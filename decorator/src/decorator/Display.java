package decorator;

import java.util.List;

public abstract class Display {
    public abstract String getTree();
    public final void show() {
        System.out.println(getTree());
    }
}