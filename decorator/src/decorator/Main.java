package decorator;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Tree(Size.MEDIUM, Color.GREEN);
        Display display2 = new StarOrnament(display1, "노란별");
        Display display3 = new BallOrnament(display1, "파란공");

        display1.show();
        display2.show();
        display3.show();

        Display display4 = new BallOrnament(new StarOrnament(new Tree(Size.LARGE, Color.RED), "흰별"), "검은공");
        display4.show();


    }
}
