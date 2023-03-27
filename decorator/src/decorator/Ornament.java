package decorator;

public abstract class Ornament extends Display {
    protected Display display;

    public Ornament(Display display) {
        this.display = display;
    }
}
