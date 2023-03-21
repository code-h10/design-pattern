import framework.Manager;
import framework.Shape;
import product.Line;
import product.Color;
import product.Point;

public class Main {
    public static void main(String[] args) {

        /* create */
        Manager manager = new Manager();
        Line redLine = new Line("red", new Point(10, 10), new Point(5, 5));
        Line blueLine = new Line("blue", new Point(10, 10), new Point(5, 5));
        manager.register("redLine", redLine);
        manager.register("blueLine", blueLine);

        /* clone */
        Shape cloneRedLine = manager.create("redLine");
        cloneRedLine.draw();
        Shape cloneBlueLine = manager.create("blueLine");
        cloneBlueLine.draw();


    }
}
