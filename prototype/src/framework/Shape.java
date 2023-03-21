package framework;

public interface Shape extends Cloneable{
    public abstract void draw();
    public abstract Shape createClone();
}
