package product;

import framework.Shape;

public class Line implements Shape {
    private String color;
    private Point position1;
    private Point position2;

    public Line(String color, Point position1, Point position2) {
        this.color = color;
        this.position1 = position1;
        this.position2 = position2;
    }

    @Override
    public void draw() {
        System.out.println("drawing with " + color);
    }

    @Override
    public Shape createClone() {
        Shape p = null;
        try {
            p = (Shape) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
