package decorator;

import java.util.List;

public class StarOrnament extends Ornament{
    private String name;
    public StarOrnament(Display display, String name) {
        super(display);
        this.name = name;
    }

    @Override
    public String getTree() {
        return name + " 장식이 추가 된 " + display.getTree();
    }
}
