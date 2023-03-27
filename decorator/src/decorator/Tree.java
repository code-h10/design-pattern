package decorator;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Display {
    private Size size;
    private Color color;

    public Tree(Size size, Color color) {
        this.size = size;
        this.color = color;

    }

    public void setUp(String location) {
        System.out.println(location + "에 트리를 설치합니다.");
    }


    @Override
    public String getTree() {
        return this.color.name() + " 색상과 " + this.size.name() + " 사이즈 트리";
    }
}
